package com.springcloud.ribbonclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;


@SpringBootApplication
@RibbonClient("user-server-provider")//指定目标应用名称
public class RibbonClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonClientApplication.class, args);
	}

}
