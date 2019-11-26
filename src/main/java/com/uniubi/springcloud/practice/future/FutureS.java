package com.uniubi.springcloud.practice.future;

/**
 * @Auther: jerry.feng
 * @Date: 2019/9/2
 * @Description:
 */

public class FutureS<T> {
    private T t;

    public FutureS(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public <T> T future(){
        return (T) getT();
    }
}
