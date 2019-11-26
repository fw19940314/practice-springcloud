package com.springcloud.study.eurekclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekclientApplication.class, args);
	}

}
