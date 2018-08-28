package com.liuxv.tws.service;

import com.liuxv.tws.po.Robot;
import com.liuxv.tws.po.User;

import java.util.List;

/**
 * created by liuxv on 2018/6/12
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
public interface UserService {

    public List<User> getAllUser();

    public User getUserById(String id);

}
