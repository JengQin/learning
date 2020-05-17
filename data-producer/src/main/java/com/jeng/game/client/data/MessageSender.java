package com.jeng.game.client.data;

import com.jeng.game.common.Config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * The MessageSender
 *
 * @author JiaZheng
 * @create 2020-05-17 17:23
 */
public class MessageSender implements Runnable{
    private static final Logger LOGGER = LoggerFactory.getLogger(MessageSender.class);
    private SocketChannel server;
    private BlockingQueue<String> msgQueue;
    private volatile boolean isTerminated = false;

    private ByteBuffer line = ByteBuffer.wrap("\r\n".getBytes());

    public MessageSender(BlockingQueue<String> msgQueue) {
        this.msgQueue = msgQueue;
        try {
            InetSocketAddress serverAddress = new InetSocketAddress(Config.getConfig(Config.SERVER_HOST),Integer.valueOf(Config.getConfig(Config.SERVER_PORT)));
            server = SocketChannel.open(serverAddress);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void send(String msg) throws IOException {
        ByteBuffer buffer = ByteBuffer.wrap(msg.getBytes("UTF-8"));
        server.write(buffer);
    }

    @Override
    public void run() {
        int count = 0;
        while (!isTerminated) {
            try {
                //从队列中获取消息
                String msg = msgQueue.poll(5L,TimeUnit.SECONDS);
                if (null != msg) {
                    count++;
                    send(msg + "\r\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
                isTerminated = true;
            } catch (InterruptedException e) {
                LOGGER.error("Can not poll data from message BlockingQueue，after 5s.");
            }
        }
        try {
            LOGGER.info("Closing socket channel");
            server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        LOGGER.info("Total send message count: " + count);
    }
    public boolean isTerminated() {
        return isTerminated;
    }

    public void setTerminated(boolean terminated) {
        isTerminated = terminated;
    }
}
