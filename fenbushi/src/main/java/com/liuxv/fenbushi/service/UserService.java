package com.liuxv.fenbushi.service;

import com.liuxv.fenbushi.po.User;

import java.util.List;

/**
 * created by liuxv on 2018/6/27
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
public interface UserService
{
    public List<User> getAllUser();

    public void insert(User user);

}
