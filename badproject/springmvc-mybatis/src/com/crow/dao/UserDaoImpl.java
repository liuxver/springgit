package com.crow.dao;
/**
 * created by liuxv on 2018/5/2
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
import com.crow.po.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDaoImpl implements UserDao {
    private SqlSessionFactory sqlSessionFactory;
    public UserDaoImpl(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public void insertUser(User user) throws Exception{
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.insert("test.insertUser", user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public User findUserById(int id) throws Exception{
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("test.findUserById", id);
        sqlSession.close();
        return user;
    }

    @Override
    public List<User> findUserByName(String name) throws Exception{
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> userList = sqlSession.selectList("test.findUserByName", name);
        sqlSession.close();
        return userList;
    }

    @Override
    public void deleteUser(int id) throws Exception{
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.delete("test.deleteUser", id);
        sqlSession.commit();
        sqlSession.close();
    }
}
