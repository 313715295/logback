package com.zwq.logback.controller;

import com.zwq.logback.dao.UserDao;
import com.zwq.logback.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * created by zwq on 2018/7/29
 */
@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;
    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User selectById(int id) {
        return userDao.selectById(id);
    }
}
