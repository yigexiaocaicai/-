package com.du.chat.mapper;

import com.du.chat.dto.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * @author duwen.fu
 * @version 1.0
 * @date 2020/11/12 18:42
 */
@Repository
public interface UserMapper {

    /**
     * 用户注册
     * @author duwen.fu
     * @param user 用户信息
     */
    void register(@Param("user") User user);

    /**
     * 用户查询
     * @return 用户列表
     */
    List<User> select();
}
