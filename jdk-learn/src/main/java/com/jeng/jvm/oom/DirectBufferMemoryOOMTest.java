package com.jeng.jvm.oom;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

public class DirectBufferMemoryOOMTest {

    public static void main(String[] args) throws InterruptedException {
        /*
        -Xms10M -Xmx10M -XX:+PrintGCDetails -XX:MaxDirectMemorySize=20M
         */

        System.out.println("堆外内存大小："+sun.misc.VM.maxDirectMemory() / 1024 /1024 +"M");
        TimeUnit.SECONDS.sleep(2);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(21 * 1024 * 1024);
    }
}
