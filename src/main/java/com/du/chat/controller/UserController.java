package com.du.chat.controller;

import com.du.chat.dto.User;
import com.du.chat.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author duwen.fu
 * @version 1.0
 * @date 2020/11/12 18:45
 */
@Api(value = "用户模块")
@RestController
@RequestMapping("/user")
public class UserController{

    @Autowired
    private UserService userService;

    @ApiOperation("用户注册")
    @RequestMapping(value = "/login",method = RequestMethod.PUT)
    public void register(@RequestBody User user){
        userService.insert(user);
    }

    @ApiOperation(value = "获取用户信息")
    @ResponseBody
    @GetMapping("/get")
    public String get(){
        List<User> user = userService.select();
        return user.toString();
    }

}
