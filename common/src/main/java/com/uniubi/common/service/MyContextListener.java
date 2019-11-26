package com.uniubi.common.service;

import org.springframework.context.ApplicationListener;

/**
 * @Auther: jerry.feng
 * @Date: 2019/8/21
 * @Description:
 */
public class MyContextListener implements ApplicationListener<MyContextEvent> {
    @Override
    public void onApplicationEvent(MyContextEvent myContextEvent) {
        System.out.println("listener this MyContextEvent....");
    }
}
