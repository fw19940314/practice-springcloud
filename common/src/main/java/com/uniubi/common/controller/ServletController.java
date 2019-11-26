package com.uniubi.common.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: jerry.feng
 * @Date: 2019/8/20
 * @Description:
 */
@RestController
public class ServletController {
    @Autowired
    ServletOn servletOn;

    @GetMapping("/getMessage")
    public String getMessage(){
        servletOn.on();
        servletOn.getMessage();
//        servletOn.onRefelish();
        return "success ok!";
    }


    @PostMapping("/getPostMessage")
    public String getPost(){
        return "success ok!";
    }


}
