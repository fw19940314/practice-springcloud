package com.uniubi.springcloud.practice.proxycreator;

import org.aopalliance.aop.Advice;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Auther: jerry.feng
 * @Date: 2019/9/10
 * @Description:
 */
//@Component
public class MyMethodInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println(getClass()+"调用方法前");
        Object ret=methodInvocation.proceed();
        System.out.println(getClass()+"调用方法后");
        return ret;
    }
}
