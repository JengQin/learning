package com.jeng.jvm.oom;

import sun.misc.VM;

public class DefaultMemorySizeTest {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory() / 1024 /1024;
        long totalMemory = runtime.totalMemory() / 1024 /1024;

        long maxDirectMemory = VM.maxDirectMemory() / 1024 /1024;

        System.out.println("最大堆内存："+maxMemory);
        System.out.println("当前总堆内存："+totalMemory);
        System.out.println("最大堆外内存："+maxDirectMemory);
    }
}
