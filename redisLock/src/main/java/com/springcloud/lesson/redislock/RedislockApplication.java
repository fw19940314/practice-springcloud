package com.springcloud.lesson.redislock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
public class RedislockApplication {
    public static void main(String[] args) {
        SpringApplication.run(RedislockApplication.class, args);
    }

}
