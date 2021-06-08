package com.jeng.zookeeper.distributedlock;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class Test {

    private static String zkHost = "192.168.9.226:2181";
    private static String rootPath="/dsp_iop/test";
    private static String lockNode = "activity_lock";

    public static void main(String[] args) throws IOException, KeeperException, InterruptedException {
        ZooKeeper zkClient = new ZooKeeper(zkHost, 3000, new SessionWatcher());


        createRootPathIfNecessary(zkClient,rootPath);

        // 创建锁node

        String lockNodePath = zkClient.create(rootPath + "/" + lockNode, new byte[0], ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL_SEQUENTIAL);


        boolean getOrRegisterLock = false;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        while (!getOrRegisterLock) {
            // 获取所有的子node,判断当前锁node是否是最小
            List<String> children = zkClient.getChildren(rootPath, false);
            Collections.sort(children);
            if (lockNodePath.equals(rootPath + "/" + children.get(0))) {//如果是最小的则执行
                getOrRegisterLock = true;
                countDownLatch.countDown();
            } else { //如果不是最小的则监听前一个子node,如果前一个子node已经不存在则执行（或重新获取所有的子node）
                String preLockNode = children.get(0);
                for (int i = 1; i < children.size(); i++) {
                    String curNode = children.get(i);
                    if (lockNodePath.equals(rootPath + "/" + curNode)) {

                    }
                    preLockNode = curNode;
                }
            }


        }


//        zkClient.delete(lockNodePath, -1);



    }

    private static void createRootPathIfNecessary(ZooKeeper zkClient, String rootPath) throws KeeperException, InterruptedException {
        Stat exists = zkClient.exists(rootPath, false);
        if (null == exists) {
            String result = zkClient.create(rootPath, new byte[0], ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
            System.out.println("创建rootPath:" + result);
        }
    }
}
