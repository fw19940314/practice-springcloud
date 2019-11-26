package com.springcloud.study.eurekclient.controller;

import com.springcloud.study.eurekclient.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: jerry.feng
 * @Date: 2019/8/11
 * @Description:
 */
@RestController
public class StatusController {
    @Autowired
    Environment environment;

    @RequestMapping(value = "/status", method = RequestMethod.GET)
    public String status() {
        return "ok";
    }

    @GetMapping(value = "getEnvironment")
    public void test(){
        String property = environment.getProperty("jdbc.name");
        String feauterSwitch = environment.getProperty("uniubi.feauterSwitch");
        String so = environment.getProperty("uniubi.so");


        System.out.println("property:"+property);
        System.out.println("feauterSwitch:"+feauterSwitch);
        System.out.println("so:"+so);


    }

}
