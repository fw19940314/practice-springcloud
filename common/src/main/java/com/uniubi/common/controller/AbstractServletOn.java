package com.uniubi.common.controller;

/**
 * @Auther: jerry.feng
 * @Date: 2019/8/21
 * @Description:
 */
public abstract class AbstractServletOn implements ServletInterfaceThem{
    protected void on(){
        System.out.println("this abstract method...");
    }

    abstract String getMessage();

}
