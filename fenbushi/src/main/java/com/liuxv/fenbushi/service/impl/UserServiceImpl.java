package com.liuxv.fenbushi.service.impl;

import com.liuxv.fenbushi.mapper.UserMapper;
import com.liuxv.fenbushi.po.User;
import com.liuxv.fenbushi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created by liuxv on 2018/6/27
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        List<User> list=userMapper.getAllUser();
        return list;
    }

    @Override
    public void insert(User user) {
        userMapper.insert( user );
    }
}
