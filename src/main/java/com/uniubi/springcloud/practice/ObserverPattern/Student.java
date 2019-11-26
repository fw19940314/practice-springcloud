package com.uniubi.springcloud.practice.ObserverPattern;

import java.util.Observable;
import java.util.Observer;

/**
 * @Auther: jerry.feng
 * @Date: 2019/7/22
 * @Description: 观察者
 */
public class Student implements Observer {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Teacher teacher = (Teacher) o;
        System.out.printf("学生%s观察到（实际是被通知）%s布置了作业《%s》 \n", this.name, teacher.getName(), arg);
    }

}
