package com.du.chat.chat;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author duwen.fu
 * @version 1.0
 * @date 2020/11/11 18:10
 */
public class ChatClientHandler extends SimpleChannelInboundHandler<String> {
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, String s) throws Exception {
        //直接输出消息
        System.out.println(s);
    }
}
