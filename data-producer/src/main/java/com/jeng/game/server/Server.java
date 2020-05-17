package com.jeng.game.server;

import com.jeng.game.common.Config;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.LineBasedFrameDecoder;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.Charset;

/**
 * The Server
 *
 * @author JiaZheng
 * @create 2020-05-17 15:26
 */
public class Server {
    private static final Logger LOGGER = LoggerFactory.getLogger(Server.class);

    public static void main(String[] args) {
//        try {
//            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
//            serverSocketChannel.configureBlocking(false);
//            serverSocketChannel.bind(new InetSocketAddress(
//                            Config.getConfig(Config.SERVER_HOST)
//                            , Integer.valueOf(Config.getConfig(Config.SERVER_PORT))
//                    )
//            );
//            Selector selector = Selector.open();
//            serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
//            while (true) {
//                int select = selector.select();
//                Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
//                while (iterator.hasNext()) {
//                    SelectionKey key = iterator.next();
//                    if (key.isAcceptable()) {
//                        handleAcceptable(key, selector);
//                    } else if (key.isReadable()) {
//                        handleRead(key, selector);
//                    }
//                }
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try {
            new Server().action();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // netty 服务端启动
    public void action() throws InterruptedException{

        // 用来接收进来的连接
        EventLoopGroup bossGroup = new NioEventLoopGroup(1);
        // 用来处理已经被接收的连接，一旦bossGroup接收到连接，就会把连接信息注册到workerGroup上
        EventLoopGroup workerGroup = new NioEventLoopGroup(2);

        try {
            // nio服务的启动类
            ServerBootstrap sbs = new ServerBootstrap();
            // 配置nio服务参数
            sbs.group(bossGroup, workerGroup)
                    .channel(NioServerSocketChannel.class) // 说明一个新的Channel如何接收进来的连接
                    .option(ChannelOption.SO_BACKLOG, 128) // tcp最大缓存链接个数
                    .childOption(ChannelOption.SO_KEEPALIVE, true) //保持连接
                    .handler(new LoggingHandler(LogLevel.INFO)) // 打印日志级别
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel socketChannel) throws Exception {
                            socketChannel.pipeline().addLast(new LineBasedFrameDecoder(1024)); //解决粘包问题
                            socketChannel.pipeline().addLast(new StringDecoder()); //解决粘包问题
                            socketChannel.pipeline().addLast(new StringEncoder());
                            // 处理接收到的请求
                            socketChannel.pipeline().addLast(new ServerHandler()); // 这里相当于过滤器，可以配置多个
                        }
                    });

            LOGGER.info("Server start --------------");
            // 绑定端口，开始接受链接
            String host = Config.getConfig(Config.SERVER_HOST);
            int port = Integer.valueOf(Config.getConfig(Config.SERVER_PORT));
            ChannelFuture cf = sbs.bind(host,port).sync();
            // 等待服务端口的关闭
            cf.channel().closeFuture().sync();
        } finally{
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }
}
