package com.zwq.logback.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * created by zwq on 2018/7/29
 */
@Getter
@Setter
public class User {

    private Integer id;
    private String name;
    private String password;
    private Integer autho = 1;



}
