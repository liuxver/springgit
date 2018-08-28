package com.liuxv.twoshou.service.impl;

import com.liuxv.twoshou.mapper.UserMapper;
import com.liuxv.twoshou.po.User;
import com.liuxv.twoshou.po.UserExample;
import com.liuxv.twoshou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * created by liuxv on 2018/5/27
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public void insertUser(User user) {
        userMapper.insert( user );
    }

    @Override
    public List<User> getAllUser() {
        //UserExample userExample=new UserExample();
        List<User> users=userMapper.selectAllUsers();

        System.out.println( users.size() );
        return users;
        //return null;
    }

    @Override
    public User getUserByName(String name) {
        return userMapper.selectByPrimaryKey( name );
    }

    @Override
    public void deleteUser(String name) {
        userMapper.deleteByPrimaryKey( name );
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateByPrimaryKey( user );
    }
}
