package com.jeng.zookeeper.distributedlock;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;

import java.util.concurrent.CountDownLatch;

public class LockWatcher implements Watcher {
    private CountDownLatch countDownLatch;

    public LockWatcher(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void process(WatchedEvent event) {
        // 判断是否是NodeDelete事件
        Event.EventType eventType = event.getType();
        if (eventType == Event.EventType.NodeDeleted) {
            // TODO: 2021/5/6/006 获取到锁，继续执行
            countDownLatch.countDown();
        }
    }
}
