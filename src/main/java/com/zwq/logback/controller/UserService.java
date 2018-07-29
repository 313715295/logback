package com.zwq.logback.controller;

import com.zwq.logback.pojo.User;

/**
 * created by zwq on 2018/7/29
 */
public interface UserService {

    User selectById(int id);
}
