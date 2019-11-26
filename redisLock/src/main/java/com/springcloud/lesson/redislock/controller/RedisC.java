package com.springcloud.lesson.redislock.controller;

import com.springcloud.lesson.redislock.domain.User;
import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Auther: jerry.feng
 * @Date: 2019/8/14
 * @Description:
 */
@RestController
public class RedisC {
//    @Autowired
//    JRedisService jRedisServer;

    @GetMapping("/setValue")
    public void setValue(){
//        jRedisServer.add("JERRY","fengwei");
    }

    public static void main(String[] args) {
        List<User> list = new ArrayList();
        list.add(new User("jerry",25));
        list.add(new User("tom",28));
        list.add(new User("com",205));
        List<User> userList = list.stream().map(x -> new User(x.getName(), 1)).collect(Collectors.toList());
        System.out.println(userList);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(null!=list);
    }

}
