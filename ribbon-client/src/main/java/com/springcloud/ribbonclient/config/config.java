package com.springcloud.ribbonclient.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.cloud.netflix.ribbon.SpringClientFactory;
import org.springframework.context.annotation.Bean;

/**
 * @Auther: jerry.feng
 * @Date: 2019/8/24
 * @Description:
 */
@Configurable
public class config {
//    @Bean
//    public LoadBalancerClient loadBalancerClient(){
//      return new RibbonLoadBalancerClient(new SpringClientFactory());
//    }
}
