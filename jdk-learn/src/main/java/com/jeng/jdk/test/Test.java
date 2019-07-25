package com.jeng.jdk.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        File file = new File("test.txt");
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            byte[] arr = new byte[1024];
            int read = fileInputStream.read(arr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
