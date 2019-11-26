package com.springcloud.lesson.redislock.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.annotation.Import;

/**
 * @Auther: jerry.feng
 * @Date: 2019/8/15
 * @Description:
 */
@Import({Device.class})
public class User implements BeanFactoryAware,BeanNameAware,InitializingBean,DisposableBean {
    /**
     *
     */
    private String name;

    /**
    *
    */
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("第二个调用");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("第一个调用");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("最后调用");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("第三个调用");
    }

}
