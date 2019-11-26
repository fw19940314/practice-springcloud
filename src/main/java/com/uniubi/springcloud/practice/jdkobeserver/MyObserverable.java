package com.uniubi.springcloud.practice.jdkobeserver;

import java.util.Observable;

/**
 * @Auther: jerry.feng
 * @Date: 2019/8/7
 * @Description: 被观察者目标（事件发起者）
 */
public class MyObserverable extends Observable {
    public MyObserverable() {
        System.out.println("被观察者已上线....");
    }

    //被观察者数据
    private String data = "message";

    public String getData() {
        return data;
    }

    /**
     * 如果有如果改变
     * @param data
     */
    public void setData(String data) {
        if (!this.data.equals(data)) {
            this.data = data;
            //更改变化状态
            setChanged();
        }
        //通知注册的观察者
        notifyObservers(data);
    }
}
