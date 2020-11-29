package com.du.chat.dto;


import lombok.Getter;
import lombok.Setter;

/**
 * @author duwen.fu
 * @version 1.0
 * @date 2020/11/12 18:37
 */
@Setter
@Getter
public class User {
    /**
     * 用户id
     */
    private Long userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户代码
     */
    private String userCode;

    /**
     * 个性签名
     */
    private String signature;

    /**
     * 电话号码
     */
    private String phone;

    @Override
    public String toString() {
        return "用户" + userName + "的个性签名是：" + signature;
    }
}
