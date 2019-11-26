package com.uniubi.springcloud.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeApplication {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(PracticeApplication.class);
        springApplication.setWebApplicationType(WebApplicationType.SERVLET);
        springApplication.run(args);
        publish();

    }

    //EventBus事件发布
    public static void publish(){
//        MyEventBus.post(new User("tom",321));
    }

}
