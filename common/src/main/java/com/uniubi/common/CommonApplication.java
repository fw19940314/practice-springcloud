package com.uniubi.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.uniubi.common.service")
@EnableDiscoveryClient
@ServletComponentScan
@SpringBootApplication
public class CommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonApplication.class, args);
    }

}
