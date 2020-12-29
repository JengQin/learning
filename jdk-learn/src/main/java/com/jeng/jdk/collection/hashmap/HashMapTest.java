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
    *   1）获取key的hash值
    *   2).检查数组table是否为空，如果为空，则执行一次resize()扩容操作
    *   3）使用i=(table.length-1) & hash计算newNode要插入的bin，因为table.length是2的倍数（二进制为10000...）减一后的二进制为1111...，所以(table.length-1) & hash后会得到一个小于table.length的数
    *       a）如果table[i]==null,则直接将newNode插入到table[i]
    *       b）如果table[i]!=null，判断当前bin是tree结构还是链表结构
    *           1)如果是链表结构，遍历链表查找key的位置，如果key不存在则采用尾插入法，将newNode加入链表中，并判断是否进行treeIfBin转红黑树操作
    *           2）如果是tree结构，则执行putTreeVal向红黑树put节点
    * get读取流程：
    * 扩容流程：capacity<<1, threshold<<1, 如果capacity>
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
        HashMap<Integer, String> map = new HashMap<>(1<<30);
        String value = "";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 805306368; i++) {
            map.put(i, value);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(String.format("map大小%d, 耗时%d",map.size(),(endTime-startTime)));
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
