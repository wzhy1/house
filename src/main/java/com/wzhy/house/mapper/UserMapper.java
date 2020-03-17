package com.wzhy.house.mapper;

import com.wzhy.house.model.User;

public interface UserMapper {
    //用户名密码查找
    public User getUser(User user);
}