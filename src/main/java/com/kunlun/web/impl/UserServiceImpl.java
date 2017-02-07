package com.kunlun.web.impl;

import com.kunlun.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by kunlun on 2017/2/7.
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void create(String name, Integer age) {
        jdbcTemplate.update("insert into USER (NAME,AGE) values(?,?)",name,age);
    }

    @Override
    public void deleteByName(String name) {

    }

    @Override
    public Integer getUserCount() {
        return null;
    }
}
