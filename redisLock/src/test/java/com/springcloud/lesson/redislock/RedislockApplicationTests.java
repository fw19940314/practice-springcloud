package com.springcloud.lesson.redislock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

//@RunWith(SpringRunner.class)
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration
public class RedislockApplicationTests {

    @Resource
    RedisTemplate template;

    @Test
    public void contextLoads() {
        template.opsForValue().set("name","fengwei");
    }

}
