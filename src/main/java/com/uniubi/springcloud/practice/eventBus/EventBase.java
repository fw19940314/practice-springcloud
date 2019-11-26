package com.uniubi.springcloud.practice.eventBus;

/**
 * @Auther: jerry.feng
 * @Date: 2019/8/22
 * @Description:
 */
public class EventBase {
    private String values;

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "EventBase{" +
                "values='" + values + '\'' +
                '}';
    }
}
