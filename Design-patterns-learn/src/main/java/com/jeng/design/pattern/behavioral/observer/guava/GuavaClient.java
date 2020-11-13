package com.jeng.design.pattern.behavioral.observer.guava;

public class GuavaClient {

    public static void main(String[] args) {
        Notice notice = new Notice("....");
        notice.registerObserver(new Department("研发部"));
        notice.registerObserver(new Department("行政部"));

        notice.changeAndNotify("为了庆祝公司举得新的里程碑成就，今天下午准备了丰盛的下午茶");


    }
}
