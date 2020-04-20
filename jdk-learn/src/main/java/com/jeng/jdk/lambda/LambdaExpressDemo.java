package com.jeng.jdk.lambda;

/**
 * The LambdaExpressDemo
 *
 * @author JiaZheng
 * @create 2020-04-16 21:30
 */
public class LambdaExpressDemo {

    public static void main(String[] args) {
        Foo foo = () -> {
            System.out.println("Say Hi!");
        };
        foo.sayBey();
        foo.sayHi();
        Foo.sayBey("Li");
    }

}


@FunctionalInterface
interface Foo{
    void sayHi();

    // 接口的default方法可以有默认实现
    default void sayBey(){
        System.out.println("Good Bey");
    }

    // 接口的静态方法可以有方法体
    static void sayBey(String name){
        System.out.println("Good Bey "+ name);
    }

}




