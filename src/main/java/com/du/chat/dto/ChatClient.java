package com.du.chat.dto;

/**
 * @author duwen.fu
 * @version 1.0
 * @date 2020/11/13 11:42
 */
public class ChatClient {
    private String host;
    private int port;

    public ChatClient(String host, int port) {
        this.host = host;
        this.port = port;
    }
}
