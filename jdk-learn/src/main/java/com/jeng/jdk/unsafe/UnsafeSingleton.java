package com.jeng.jdk.unsafe;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * The UnsafeSingleton
 *
 * @author JiaZheng
 * @create 2020-02-26 21:11
 */
public class UnsafeSingleton {
    private static volatile Unsafe unsafe;

    public static Unsafe getInstance(){
        if (null == unsafe) {
            synchronized (UnsafeSingleton.class) {
                if (null == unsafe) {
                    try {
                        Field field = Unsafe.class.getDeclaredField("theUnsafe");
                        field.setAccessible(true);
                        unsafe = (Unsafe) field.get(null);
                    } catch (NoSuchFieldException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return unsafe;
    }
}
