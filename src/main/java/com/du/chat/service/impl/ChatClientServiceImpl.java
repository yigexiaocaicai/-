package com.du.chat.service.impl;

import com.du.chat.chat.ChatClientInitializer;
import com.du.chat.service.ChatClientService;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author duwen.fu
 * @version 1.0
 * @date 2020/11/13 12:04
 */
@Service
public class ChatClientServiceImpl implements ChatClientService {

    @Value("${netty.tcp.server.port}")
    private int port;

    @Value("${netty.tcp.server.host}")
    private String host;

    @Override
    public void chatOnLineClient(){
        try {
            start();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    private void start() throws InterruptedException {
        EventLoopGroup group = new NioEventLoopGroup();
        try {
            Bootstrap b = new Bootstrap();
            b.group(group)
                    .channel(NioSocketChannel.class)
                    .handler(new ChatClientInitializer());

            Channel channel = b.connect(host,port).sync().channel();
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            while (true){
                channel.writeAndFlush(input.readLine() + "\n");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            group.shutdownGracefully().sync();
        }
    }
}
