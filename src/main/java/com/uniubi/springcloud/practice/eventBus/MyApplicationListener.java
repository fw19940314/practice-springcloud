package com.uniubi.springcloud.practice.eventBus;

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @Auther: jerry.feng
 * @Date: 2019/8/7
 * @Description: listener
 */

@Component
abstract class MyApplicationListener implements ApplicationListener<ApplicationPreparedEvent> {
    /**
     *  ApplicationPreparedEvent 上下文准备事件
     * @param applicationPreparedEvent
     */
    @Override
    public void onApplicationEvent(ApplicationPreparedEvent applicationPreparedEvent) {
        ConfigurableApplicationContext applicationContext = applicationPreparedEvent.getApplicationContext();
        MyApplicationListener bean = applicationContext.getBean(this.getClass());
        System.out.println("regist listener to eventBus...."+bean);
        MyEventBus.register(bean);
    }

}
