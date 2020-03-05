package com.jeng.jdk.file;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.OpenOption;
import java.nio.file.StandardOpenOption;

public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        bio();
//        nio();
    }

    private static void nio() throws IOException {
        File file = new File("E:/tmp/csapp.pdf");
        File file2 = new File("E:/tmp/csapp2.pdf");
        file2.createNewFile();
        FileChannel input = FileChannel.open(file.toPath());
        FileChannel output = FileChannel.open(file2.toPath(), StandardOpenOption.WRITE);
        long startTime = System.nanoTime();
//            input.map(FileChannel.MapMode.READ_ONLY, 0, input.size());
        input.transferTo(0, input.size(), output);
        long endTIme = System.nanoTime();

        System.out.println((endTIme - startTime) + "," + (endTIme - startTime) / 1000_000);
    }

    private static void bio() throws IOException {
        File file = new File("E:/tmp/csapp.pdf");
        File file2 = new File("E:/tmp/csapp2.pdf");
        InputStream inputStream = new FileInputStream(file);
        OutputStream out = new FileOutputStream(file2);
        byte[] readBuffer = new byte[1024 * 4];
        long startTime = System.nanoTime();
        while (true) {
            int read = inputStream.read(readBuffer, 0, readBuffer.length);
            if (-1 == read) {
                break;
            }
            out.write(readBuffer, 0, read);
        }
        long endTIme = System.nanoTime();
        inputStream.close();
        out.close();
        System.out.println((endTIme - startTime) + "," + (endTIme - startTime) / 1000_000);
    }
}
