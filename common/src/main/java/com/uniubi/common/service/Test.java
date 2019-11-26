package com.uniubi.common.service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: jerry.feng
 * @Date: 2019/8/21
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        //获取IOC容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //注册监听者
        context.register(MyContextListener.class);
        //刷新容器
        context.refresh();
        //事件发布
        context.publishEvent(new MyContextEvent("publish this event ...."));
    }
}
