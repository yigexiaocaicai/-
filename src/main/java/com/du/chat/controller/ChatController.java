package com.du.chat.controller;

import com.du.chat.service.ChatClientService;
import com.du.chat.service.impl.ChatServerServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author duwen.fu
 * @version 1.0
 * @date 2020/11/13 11:25
 * fix 一
 */
@Api(value = "聊天模块")
@RestController
@RequestMapping("/chat")
public class ChatController {

    @Autowired
    private ChatClientService chatClientService;

    @Autowired
    private ChatServerServiceImpl chatServerService;

    @ApiOperation("开启客户端-在线聊天-在线接收消息")
    @RequestMapping(value = "/online", method = RequestMethod.PUT)
    public void chatOnLine(){
        chatClientService.chatOnLineClient();
    }

    @ApiOperation("开启聊天服务（目前只支持一个人开启，不支持多人开启）")
    @RequestMapping(value = "/open", method = RequestMethod.PUT)
    public void openService(){
        chatServerService.chatOnLineServer();
    }

}
