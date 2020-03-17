package com.wzhy.house.service.impl;

import com.wzhy.house.mapper.UserMapper;
import com.wzhy.house.model.User;
import com.wzhy.house.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired(required = false)
    private UserMapper userMapper;
    @Override
    public User getUser(User user) {

        return userMapper.getUser(user);
    }
}
