package com.jeng.zookeeper.watch;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.proto.WatcherEvent;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

public class WatchTest {

    public static void main(String[] args) throws IOException, InterruptedException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);

        ZooKeeper zooKeeper = new ZooKeeper("hadoop1:2181", 3000, new Watcher() {
            public void process(WatchedEvent watchedEvent) {
                String path = watchedEvent.getPath();
                Event.KeeperState state = watchedEvent.getState();
                Event.EventType type = watchedEvent.getType();
                WatcherEvent wrapper = watchedEvent.getWrapper();
                System.out.println(path);
                System.out.println(state);
                System.out.println(type);
                System.out.println(watchedEvent);

                switch (state) {
                    case Unknown:
                        break;
                    case Disconnected:
                        System.out.println("Disconnected");
                        break;
                    case NoSyncConnected:
                        break;
                    case SyncConnected:
                        System.out.println("SyncConnected");
                        countDownLatch.countDown();
                        break;
                    case AuthFailed:
                        break;
                    case ConnectedReadOnly:
                        break;
                    case SaslAuthenticated:
                        break;
                    case Expired:
                        break;
                }

                switch (type) {
                    case None:
                        break;
                    case NodeCreated:
                        break;
                    case NodeDeleted:
                        break;
                    case NodeDataChanged:
                        break;
                    case NodeChildrenChanged:
                        break;
                }
            }
        });
        countDownLatch.await();
        ZooKeeper.States state = zooKeeper.getState();
        switch (state) {
            case CONNECTING:
                System.out.println("CONNECTING");
                break;
            case ASSOCIATING:
                System.out.println("ASSOCIATING");
                break;
            case CONNECTED:
                System.out.println("CONNECTED");
                break;
            case CONNECTEDREADONLY:
                break;
            case CLOSED:
                break;
            case AUTH_FAILED:
                break;
            case NOT_CONNECTED:
                break;
        }
    }
}
