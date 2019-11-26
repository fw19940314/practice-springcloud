package com.uniubi.springcloud.practice.eventBus;

import com.google.common.eventbus.EventBus;

/**
 * @Auther: jerry.feng
 * @Date: 2019/8/7
 * @Description: eventBus
 */
public class MyEventBus {

    /** 时间任务总线 */
    private final static EventBus tiemEventBus = new EventBus();

    /**
     * 触发同步事件
     *
     * @param event
     */
    public static void post(Object event) {
        tiemEventBus.post(event);
    }

    /**
     * 注册事件处理器
     *
     * @param handler
     */
    public static void register(Object handler) {
        tiemEventBus.register(handler);
    }

    /**
     * 注销事件处理器
     *
     * @param handler
     */
    public static void unregister(Object handler) {
        tiemEventBus.unregister(handler);
    }
}
