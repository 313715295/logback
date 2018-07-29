package com.zwq.logback.controller;

import com.zwq.logback.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by zwq on 2018/7/29
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("get")
    public User getUser() {
        return userService.selectById(2);
    }
}
