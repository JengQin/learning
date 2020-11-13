package com.jeng.design.pattern.behavioral.observer.guava;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;
import com.jeng.design.pattern.behavioral.observer.Observer;

import java.util.concurrent.Executors;

public class Notice {
    private String constant;
    private EventBus eventBus;

    public Notice(String constant) {
        this.constant = constant;
        this.eventBus = new AsyncEventBus(Executors.newFixedThreadPool(10));
    }

    public void changeAndNotify(String newConstant) {
        this.constant = newConstant;
        System.out.println("公告栏已更新：" + newConstant);
        eventBus.post(newConstant);
    }

    public void registerObserver(Observer observer) {
        eventBus.register(observer);
    }
}
