package com.jeng.jdk.unsafe;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * The ObjectRelated
 *
 * @author JiaZheng
 * @create 2020-02-26 21:08
 */
public class ObjectRelated {

    public static void main(String[] args) throws InstantiationException, NoSuchFieldException {
        Unsafe unsafe = UnsafeSingleton.getInstance();
        // 在堆外内存“非常规”地创建一个对象
//        allocateInstance(unsafe);
        // 获取对象属性成员的偏移量
//        objectFieldOffset(unsafe);
        // 设置对象成员属性
//        putObjectFieldValue(unsafe);
        // 根据偏移量获取对象成员属性值
        getObjectFieldValue(unsafe);
    }

    private static void getObjectFieldValue(Unsafe unsafe) {
        User user = new User(25, "Jeng");
        int age = unsafe.getInt(user, 12L);
        System.out.println(age);
        System.out.println(unsafe.getObjectVolatile(user,16));
        System.out.println(unsafe.getByteVolatile(user,12L));
    }

    private static void putObjectFieldValue(Unsafe unsafe) {
        User user = new User(25, "Jeng");
        unsafe.putIntVolatile(user,12,26);
        System.out.println(user.getAge());
    }

    private static void objectFieldOffset(Unsafe unsafe) throws NoSuchFieldException {
        User user = new User(25, "Jeng");
        Field field = user.getClass().getDeclaredField("age");
        long ageOffset = unsafe.objectFieldOffset(field);
        System.out.println(ageOffset);
    }

    private static void allocateInstance(Unsafe unsafe) throws InstantiationException {
        User user = (User) unsafe.allocateInstance(User.class);
        System.out.println(user);
        System.out.println(user.getAge());
        System.out.println(user.getName());
        unsafe.putObjectVolatile(user, 16, "Jeng");
        System.out.println(user.getName());
    }
}
class User{
    private int age;
    private String name;

    public User() {
    }

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
