package com.uniubi.common.service;

import org.springframework.context.ApplicationEvent;

/**
 * @Auther: jerry.feng
 * @Date: 2019/8/21
 * @Description:
 */
public class MyContextEvent extends ApplicationEvent {
    public MyContextEvent(Object source) {
        super(source);
        System.out.println("source message->"+source.toString());
    }
}
