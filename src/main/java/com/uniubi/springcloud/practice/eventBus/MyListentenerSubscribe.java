package com.uniubi.springcloud.practice.eventBus;

import com.google.common.eventbus.Subscribe;
import org.springframework.stereotype.Component;

/**
 * @Auther: jerry.feng
 * @Date: 2019/8/7
 * @Description: listener（）
 */
@Component
public class MyListentenerSubscribe extends MyApplicationListener{

    @Subscribe
    public void on(Message message){
        System.out.println("subscribe message->  messgeType："+message.getMessageType()+"\n messageContent"+message.getMessageContent());
    }
    
}
