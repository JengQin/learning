package com.jeng.zookeeper.distributedlock;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;

public class RootPathWatcher implements Watcher {
    @Override
    public void process(WatchedEvent event) {
        Event.EventType eventType = event.getType();
        switch (eventType) {
            case NodeCreated:
                System.out.println(String.format("创建根路径: %s",event.getPath()));
                break;

            case NodeDeleted:
                System.out.println(String.format("删除根路径: %s",event.getPath()));
                break;
        }
    }
}
