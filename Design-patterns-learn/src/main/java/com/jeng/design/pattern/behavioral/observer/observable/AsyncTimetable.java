package com.jeng.design.pattern.behavioral.observer.observable;

import com.jeng.design.pattern.behavioral.observer.AsyncObservable;
import com.jeng.design.pattern.behavioral.observer.Observable;

public class AsyncTimetable extends AsyncObservable {
    public AsyncTimetable(String state) {
        super(state);
    }

    @Override
    protected String changeState(String newState) {
        String oldState = this.state;
        this.state = newState;
        System.out.println("时间表状态改变：" + oldState + " -> " + newState);
        return newState;
    }
}
