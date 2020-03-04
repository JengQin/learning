package com.jeng.jdk.file;

import java.io.*;

public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        InputStream inputStream = new FileInputStream(file);
        byte[] readBuffer= new byte[1024];
        inputStream.read(readBuffer,0,readBuffer.length);
    }
}
