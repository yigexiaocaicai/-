package com.du.chat.service;

import com.du.chat.dto.User;

import java.util.List;

/**
 * @author duwen.fu
 * @version 1.0
 * @date 2020/11/12 18:44
 */
public interface UserService {

    /**
     * <p>
     *     插入用户信息，注册用户
     * </p>
     * @author duwen.fu
     * @param user 用户
     */
    void insert(User user);

    /**
     * <p>
     *     查询用户信息
     * </p>
     * @author duwen.fu
     * @return List<User> 用户信息
     */
    List<User> select();
}
