package com.jeng.game.server;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.concurrent.BlockingQueue;

/**
 * The MessageProcessor
 *
 * @author JiaZheng
 * @create 2020-05-17 20:54
 */
public class MessageProcessor implements Runnable{
    private SocketChannel client;
    private BlockingQueue<String> msgQueue;

    public MessageProcessor(SocketChannel client, BlockingQueue<String> msgQueue) {
        this.client = client;
        this.msgQueue = msgQueue;
    }

    @Override
    public void run() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        try {
            client.read(byteBuffer);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(byteBuffer.array())));
            bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
