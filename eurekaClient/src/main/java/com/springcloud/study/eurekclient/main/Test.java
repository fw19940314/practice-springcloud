package com.springcloud.study.eurekclient.main;

import java.util.IdentityHashMap;
import java.util.Map;

/**
 * @Auther: jerry.feng
 * @Date: 2019/8/13
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Map map = new IdentityHashMap<>();
        map.put(1, "Hello");
        map.putIfAbsent(1, "World");//如果存在返回已有值，如果不存在存入，返回null
        print(map.get(1));
        print(map.size());

        map.put(1024, "A");
        map.putIfAbsent(1024, "B");
        print(map.get(1024));
        print(map.size());

        /**
         *  hello 1 A 2
         */

    }

    private static void print(Object object) {
        System.out.print(object + " ");
    }
}
