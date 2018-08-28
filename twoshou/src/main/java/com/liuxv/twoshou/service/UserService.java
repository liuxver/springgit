package com.liuxv.twoshou.service;

import com.liuxv.twoshou.po.User;

import java.util.List;

/**
 * created by liuxv on 2018/5/27
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
public interface UserService {
    public void insertUser(User user);

    public List<User> getAllUser();

    public User getUserByName(String name);

    public void deleteUser(String name);

    public void updateUser(User user);

}
