package com.uniubi.springcloud.practice.eventBus;

import java.util.Map;

/**
 * @Auther: jerry.feng
 * @Date: 2019/8/7
 * @Description:
 */
public class User extends EventBase {
    /**
     *
     */
    private String name;

    /**
    *
    */
    private int age;


    private Map<String,Object> map;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public User(String name, int age, Map<String,Object> map) {
        this.name = name;
        this.age = age;
        this.map = map;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
