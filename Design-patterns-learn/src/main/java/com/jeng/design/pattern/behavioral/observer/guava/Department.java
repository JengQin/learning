package com.jeng.design.pattern.behavioral.observer.guava;

import com.google.common.eventbus.Subscribe;
import com.jeng.design.pattern.behavioral.observer.Observer;

public class Department implements Observer {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    @Subscribe
    @Override
    public void doObserve(String stateChangeMsg) {
        System.out.println(name + "收到公告：" + stateChangeMsg);
    }
}
