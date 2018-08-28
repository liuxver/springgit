package com.crow.dao; /**
 * created by liuxv on 2018/5/2
 * email:liuxver444@gmail.com
 * qq:1369058574
 */

import com.crow.po.User;

import java.util.List;

public interface UserDao {
    /**
     * @param user
     * @throws Exception
     */
    public void insertUser(User user) throws Exception;
    public User findUserById(int id) throws Exception;
    public List<User> findUserByName(String name) throws Exception;//模糊查找
    public void deleteUser(int id) throws Exception;
}
