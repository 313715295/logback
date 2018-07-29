package com.zwq.logback.dao;

import com.zwq.logback.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * created by zwq on 2018/7/29
 */
@Mapper
public interface UserDao {

    User selectById(int id);
}
