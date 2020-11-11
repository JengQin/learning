package com.jeng.design.pattern.behavioral.strategy;

/**
 * 比较器（非单例，每种需要比较的类型对应一个比较器对象，所以使用泛型）
 */
public interface Comparator<T> {

    int compare(T o1, T o3);
}
