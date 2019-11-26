package com.springcloud.ribbonclient.web;

import com.uniubi.springcloud.userapi.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

/**
 * @Auther: jerry.feng
 * @Date: 2019/8/24
 * @Description:
 */
@RestController
public class userController {

    @Value("${service.provider.name}")
    private String serverProviderName;


    /**
     * 负载均衡客户端
     */
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("")
    public String getUser() {
        User user = new User("jerry", 25);
        //获取指定serviceId
        ServiceInstance serviceInstance = loadBalancerClient.choose(serverProviderName);
        try {
            loadBalancerClient.execute(serverProviderName, serviceInstance, instance -> {
                //服务器实例 获取主机 ip+端口
                String host = serviceInstance.getHost();
                int port = serviceInstance.getPort();
                String url = "http://" + host + ":" + port + "/user/addUser";
                RestTemplate restTemplate = new RestTemplate();
                return restTemplate.postForObject(url, user, String.class);

            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "ok";
    }
}
