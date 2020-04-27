package com.jeng.jvm.gc;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class CMSGCTest {

    public static void main(String[] args) {
    /*
    -XX:+UseConcMarkSweepGC
    -XX:CMSInitiatingOccupancyFraction=50
    -XX:CMSFullGCsBeforeCompaction=1
    -XX:+PrintGC -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+PrintGCCause
    -Xloggc:E:\software_develop\workspace\idea_workspace\junhai_workspace\learning\jdk-learn\gc_log\cms-gc-%t.log
    -XX:GCLogFileSize=1K
    -XX:NumberOfGCLogFiles=5
    -Xms40M -Xmx40M
     */

        System.out.println("CMS GC test start");
        LinkedList list = new LinkedList();
        Random random = new Random(10);
        for (; ; ) {
            int i = random.nextInt(10);
            byte[] bytes = null;
            if (0==i%2){
                bytes = new byte[1024 * 1024 * 20];
            } else{
                bytes = new byte[1024 * 100];
            }
            list.add(bytes);
            list.pollLast();
        }
    }
}
