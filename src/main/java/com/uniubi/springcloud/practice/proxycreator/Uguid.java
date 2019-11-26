package com.uniubi.springcloud.practice.proxycreator;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @Auther: jerry.feng
 * @Date: 2019/9/10
 * @Description:
 */
public class Uguid {
    private static String INSTANCE_ID = UUID.randomUUID().toString();


    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        List<String> list1 = new ArrayList<>();
//        list1.add("")

        int num = 0;
        int a =0;
        for (int i = 0; i < 10; i++) {
            num++;
//            a++;
//            System.out.println("a=="+a);
            System.out.println("first:" + num);
            for (int j = 0; j < 3; j++) {
                num++;
                System.out.println("second:" + num);
            }
        }
    }
}
