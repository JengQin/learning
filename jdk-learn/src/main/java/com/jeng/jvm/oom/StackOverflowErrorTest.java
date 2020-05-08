package com.jeng.jvm.oom;

public class StackOverflowErrorTest {

    public static void main(String[] args) {
        stackOverflowMethod();//Exception in thread "main" java.lang.StackOverflowError
    }

    private static void stackOverflowMethod() {
        stackOverflowMethod();
    }
}
