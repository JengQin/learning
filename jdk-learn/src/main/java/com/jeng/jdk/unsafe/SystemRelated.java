package com.jeng.jdk.unsafe;

import sun.misc.Unsafe;

/**
 * Unsafe类中与系统相关的操作
 *
 * @author JiaZheng
 * @create 2020-02-26 21:08
 */
public class SystemRelated {
    public static void main(String[] args) {
        Unsafe unsafe = UnsafeSingleton.getInstance();
        System.out.println(unsafe.addressSize()); // 获取操作系统的指针大小/操作系统使用地址总线的位数（32 or 64）
        System.out.println(unsafe.pageSize()); // 获取操作系统内存页大小
    }
}
