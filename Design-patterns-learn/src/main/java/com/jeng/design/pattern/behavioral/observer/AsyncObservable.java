package com.jeng.design.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 被观察者
 * 使用到的模式：
 * 1.桥接模式：观察者和被观察者分成两个独立变化的维度。
 * 2.模版方法：改变state和通知观察者的步骤固定成模版方法
 * 3.观察者模式：observable的状态变化被observer监听
 */
public abstract class AsyncObservable {

    private List<Observer> observers;
    protected String state;
    private ThreadPoolExecutor executors;

    public AsyncObservable(String state) {
        this.state = state;
        this.observers = new ArrayList<>();
        executors = new ThreadPoolExecutor(2,3,500, TimeUnit.MILLISECONDS,new LinkedBlockingQueue<>(1000));
    }

    /**
     * 模版方法
     * @param newState
     */
    public void changeStateAndNotify(String newState) {
        String stateChangedMsg = changeState(newState);
        for (Observer observer : observers) { // 通知/调用所有的观察者
            executors.submit(new Runnable() {
                @Override
                public void run() {
                    observer.doObserve(stateChangedMsg);
                }
            });
        }
    }

    /**
     * 注册观察者
     *
     * @param observer
     */
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    protected abstract String changeState(String newState) ;
}
