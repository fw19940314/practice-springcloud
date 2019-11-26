package com.uniubi.springcloud.practice.controller;

import com.uniubi.springcloud.practice.common.LogBase;
import com.uniubi.springcloud.practice.eventBus.Message;
import com.uniubi.springcloud.practice.eventBus.MyEventBus;
import com.uniubi.springcloud.practice.eventBus.User;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: jerry.feng
 * @Date: 2019/8/22
 * @Description:
 */
@RestController
public class EventPublishCtrl extends LogBase {

    @GetMapping("/publish")
    public void publishEvent() {
        log.info("this publish method...");
        MyEventBus.post(new Message(Message.MessageType.OPENDOOR,"芝麻开门！"));
    }
}
