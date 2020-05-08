package com.jeng.jvm.oom;

import java.util.Random;

public class JavaHeapSpaceOOMTest {

    public static void main(String[] args) {
        String str = "Java Heap Space";

        while (true) {
            str += str + new Random().nextInt(202020202) + new Random().nextInt(2121212121);
            str.intern();
        }
    }
}
