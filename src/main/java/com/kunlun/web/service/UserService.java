package com.kunlun.web.service;

/**
 * Created by kunlun on 2017/2/7.
 */
public interface UserService {
    /**
     * 创建用户
     * @param name
     * @param age
     */
    void create(String name,Integer age);

    /**
     * 根据用户名删除用户
     * @param name
     */
    void deleteByName(String name);

    /**
     * 查询用户总数
     * @return
     */
    Integer getUserCount();

}
