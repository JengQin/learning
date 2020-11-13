package com.jeng.design.pattern.behavioral.observer.observer;

import com.jeng.design.pattern.behavioral.observer.Observer;

public class Teacher implements Observer {
    @Override
    public void doObserve(String stateChangeMsg) {
        System.out.println("老师收到新的时间表：" + stateChangeMsg);
    }
}
