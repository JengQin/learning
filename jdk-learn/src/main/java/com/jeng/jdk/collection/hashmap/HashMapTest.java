package com.jeng.jdk.collection.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    /*
    * HashMap的属性:
    * 1.DEFAULT_INITIAL_CAPACITY = 1 << 4 // 默认初始容量为16，HashMap的容量必须为2的幂，如果在创建HashMap时手动指定了HashMap的容量，会自动转成近似的2的幂
    * 2.MAXIMUM_CAPACITY= 1 << 30  // 最大容量
    * 3.DEFAULT_LOAD_FACTOR = 0.75f // 默认负载因子
    * 4.TREEIFY_THRESHOLD=8 // 链表转为Tree的元素个数阈值，当bin中元素个数大于TREEIFY_THRESHOLD时，bin就会转成tree结构
    * 5.UNTREEIFY_THRESHOLD=6  // Tree转为链表的元素个数阈值，当bin中元素个数小于UNTREEIFY_THRESHOLD时，bin就会转成链表结构
    * 6.MIN_TREEIFY_CAPACITY=64 //
    * */

    /*
    * put插入流程：
    * get读取流程：
    * 扩容流程：
    * rehash流程：
    * 计算hashcode:
    * */

    /*
    * 1.HashMap中位运算的使用
    *   1) 求容量阈值tableSizeFor：根据创建HashMap时传入的capacity，阈值取大于capacity且最近的2的幂
    * 2.jdk7中为什么多线程情况下HashMap扩容会出现问题？如何解决？
    * 3.JDK8中关于HashMap的优化
    * */


    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        System.out.println(map.put("java", "90"));
        System.out.println(map.put("java", "80"));
        System.out.println(map.put("java", "100"));

        System.out.println(Float.isNaN(4.1f));

        System.out.println(tableSizeFor(1023));
    }

    private static int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >> 1;
        n |= n >> 2;
        n |= n >> 4;
        n |= n >> 8;
        n |= n >> 16;

        return n + 1;
    }
}
