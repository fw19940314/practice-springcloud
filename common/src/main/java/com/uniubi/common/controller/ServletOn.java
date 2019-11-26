package com.uniubi.common.controller;

import com.uniubi.common.controller.AbstractServletOn;
import org.springframework.stereotype.Component;

/**
 * @Auther: jerry.feng
 * @Date: 2019/8/21
 * @Description:
 */
@Component
public class ServletOn extends AbstractServletOn {
    @Override
    protected void on() {
//        super.on();
        System.out.println("servleton ....");
    }

    @Override
    String getMessage() {
        System.out.println("dispatch..message");
        return "dispatch...";
    }

    @Override
    public String onRefelish() {
        System.out.println("on refelish...");
        return null;
    }
}
