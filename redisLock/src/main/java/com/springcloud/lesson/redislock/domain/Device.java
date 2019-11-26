package com.springcloud.lesson.redislock.domain;

/**
 * @Auther: jerry.feng
 * @Date: 2019/8/19
 * @Description:
 */
public class Device {
    private String name;
    private int deviceId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", deviceId=" + deviceId +
                '}';
    }
}
