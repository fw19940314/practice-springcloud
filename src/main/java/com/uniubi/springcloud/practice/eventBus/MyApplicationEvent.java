package com.uniubi.springcloud.practice.eventBus;

import org.springframework.context.ApplicationEvent;

/**
 * @Auther: jerry.feng
 * @Date: 2019/8/7
 * @Description: 事件
 */
public class MyApplicationEvent extends ApplicationEvent {

    public MyApplicationEvent(Object source) {
        super(source);
    }
}
