package com.uniubi.springcloud.practice.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: jerry.feng
 * @Date: 2019/7/22
 * @Description: 被观察者
 */
public class Teacher extends java.util.Observable {

    private String name;
    private List<String> books;

    public String getName() {
        return this.name;
    }

    public Teacher(String name) {
        this.name = name;
        books = new ArrayList<String>();
    }

    public void setHomework(String homework) {
        System.out.printf("%s布置了作业%s \n", this.name, homework);
        books.add(homework);
        setChanged();
        notifyObservers(homework);

    }
}
