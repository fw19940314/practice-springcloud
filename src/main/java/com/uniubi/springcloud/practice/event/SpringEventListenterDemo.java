package com.uniubi.springcloud.practice.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @Auther: jerry.feng
 * @Date: 2019/8/6
 * @Description: spring event
 */
public class SpringEventListenterDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //增加监听器
//        context.addApplicationListener(new MyApplicationListener());
        //②注册监听器 在MyApplicationListener上加入@Component注解，使其添加至bean容器
        context.register(MyApplicationListener.class);
        //③直接在创建容器时，添加至new AnnotationConfigApplicationContext(MyApplicationListener.class);中
        //上线文启动
        context.refresh();
        //事件发布
        context.publishEvent(new MyApplicationEvent("publish this event …"));

    }

//    @Component
    public static class MyApplicationListener implements ApplicationListener<MyApplicationEvent> {
        @Override
        public void onApplicationEvent(MyApplicationEvent myApplicationEvent) {
            Object source = myApplicationEvent.getSource();
            System.out.println("receive event ："+source);
        }
    }


    private static class MyApplicationEvent extends ApplicationEvent{

        public MyApplicationEvent(Object source) {
            super(source);
        }
    }
}
