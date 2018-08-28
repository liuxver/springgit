package com.liuxv.tws.service.impl;

import com.liuxv.tws.mapper.RobotMapper;
import com.liuxv.tws.mapper.UserMapper;
import com.liuxv.tws.po.Robot;
import com.liuxv.tws.po.User;
import com.liuxv.tws.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * created by liuxv on 2018/6/12
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RobotMapper robotMapper;


    @Override
    public List<User> getAllUser() {
        List<User> list=userMapper.getAllUser();
        return list;
    }

    @Override
    public User getUserById(String id) {
        return userMapper.selectByPrimaryKey( id );
    }


}
