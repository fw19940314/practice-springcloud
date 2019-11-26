package com.springcloud.study.eurekclient.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @Auther: jerry.feng
 * @Date: 2019/8/13
 * @Description:
 */
@Configuration
@PropertySource("classpath:jdbc.properties")
public class MyConfig {
    @Autowired
    Environment environment;

    @Bean("myenvironment")
    public void getEnvironment(){
        String property = environment.getProperty("jdbc.name");
        System.out.println("property="+property);
    }
}
