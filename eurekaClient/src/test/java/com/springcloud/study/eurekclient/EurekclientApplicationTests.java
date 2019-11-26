package com.springcloud.study.eurekclient;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@PropertySource("classpath:jdbc.properties")
public class EurekclientApplicationTests {
	@Autowired
	Environment environment;

	@Test
	public void contextLoads() {
		String property = environment.getProperty("jdbc.name");
		System.out.println("jdbc.name="+property);
	}

}
