package com.crow.mapper;

/**
 * created by liuxv on 2018/5/3
 * email:liuxver444@gmail.com
 * qq:1369058574
 */

import com.crow.po.User;
import com.crow.po.UserCustom;
import com.crow.po.UserQueryVo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class UserMapperTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws IOException {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void findUserByIdTest() throws Exception{
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);//生成代理对象userMapper
        User user = userMapper.findUserById(1);
        System.out.println(user);
    }

    @Test
    public void testFindUserByUser()throws Exception{
        //获取session
        SqlSession session = sqlSessionFactory.openSession();
        //获限mapper接口实例
        UserMapper userMapper = session.getMapper(UserMapper.class);
        //构造查询条件user对象
        User user = new User();
        user.setId(1);
        user.setUsername("王五");
        //传递user对象查询用户列表
        List<User> list = userMapper.findUserByUser(user);
        //关闭session
        System.out.println( list );
        session.close();
    }



    @Test
    public void testFindUserList() throws Exception {

        SqlSession sqlSession = sqlSessionFactory.openSession();

        //创建UserMapper对象，mybatis自动生成mapper代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        //创建包装对象，设置查询条件
        UserQueryVo userQueryVo = new UserQueryVo();
        UserCustom userCustom = new UserCustom();
        //由于这里使用动态sql，如果不设置某个值，条件不会拼接在sql中
//		userCustom.setSex("1");
       // userCustom.setUsername("小明");
        //传入多个id
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(10);
        ids.add(16);
        //将ids通过userQueryVo传入statement中
        userQueryVo.setIds(ids);
        userQueryVo.setUserCustom(userCustom);
        //调用userMapper的方法

        List<UserCustom> list = userMapper.findUserList(userQueryVo);

        System.out.println(list);


    }




    @Test
    public void testFindUserCount() throws Exception {

        SqlSession sqlSession = sqlSessionFactory.openSession();

        //创建UserMapper对象，mybatis自动生成mapper代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        //创建包装对象，设置查询条件
        UserQueryVo userQueryVo = new UserQueryVo();
        UserCustom userCustom = new UserCustom();
        userCustom.setSex("1");
        userCustom.setUsername("张三丰");
        userQueryVo.setUserCustom(userCustom);
        //调用userMapper的方法

        int count = userMapper.findUserCount(userQueryVo);

        System.out.println(count);
    }



    @Test
    public void testFindUserList1() throws Exception {

        SqlSession sqlSession = sqlSessionFactory.openSession();

        //创建UserMapper对象，mybatis自动生成mapper代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        //创建包装对象，设置查询条件
        UserQueryVo userQueryVo = new UserQueryVo();
        UserCustom userCustom = new UserCustom();
        //由于这里使用动态sql，如果不设置某个值，条件不会拼接在sql中
//	userCustom.setSex("1");
        userQueryVo.setUserCustom(userCustom);
        //调用userMapper的方法

        List<UserCustom> list = userMapper.findUserList(userQueryVo);

        System.out.println(list);
    }











    @Test
    public void testFindUserByIdResultMap() throws Exception {

        SqlSession sqlSession = sqlSessionFactory.openSession();

        //创建UserMapper对象，mybatis自动生成mapper代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        //调用userMapper的方法

        User user = userMapper.findUserByIdResultMap(1);

        System.out.println(user);
    }





/*
    @Before
    public void setUp() throws IOException {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testFindUserList() throws Exception {

        SqlSession sqlSession = sqlSessionFactory.openSession();

        //创建UserMapper对象，mybatis自动生成mapper代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        //创建包装对象，设置查询条件
        UserQueryVo userQueryVo = new UserQueryVo();
        UserCustom userCustom = new UserCustom();
        //由于这里使用动态sql，如果不设置某个值，条件不会拼接在sql中
//		userCustom.setSex("1");
        userCustom.setUsername("小明");
        //传入多个id
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(10);
        ids.add(16);
        //将ids通过userQueryVo传入statement中
        userQueryVo.setIds(ids);
        userQueryVo.setUserCustom(userCustom);
        //调用userMapper的方法

        List<UserCustom> list = userMapper.findUserList(userQueryVo);

        System.out.println(list);


    }

    @Test
    public void testFindUserCount() throws Exception {

        SqlSession sqlSession = sqlSessionFactory.openSession();

        //创建UserMapper对象，mybatis自动生成mapper代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        //创建包装对象，设置查询条件
        UserQueryVo userQueryVo = new UserQueryVo();
        UserCustom userCustom = new UserCustom();
        userCustom.setSex("1");
        userCustom.setUsername("张三丰");
        userQueryVo.setUserCustom(userCustom);
        //调用userMapper的方法

        int count = userMapper.findUserCount(userQueryVo);

        System.out.println(count);


    }

    @Test
    public void findUserByIdTest() throws Exception{
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);//生成代理对象userMapper
        User user = userMapper.findUserById(16);
        System.out.println(user);
    }

    @Test
    public void findUserByNameTest() throws Exception{
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.findUserByName("张小明");
        System.out.println(userList);
    }

    @Test
    public void findUserBySexTest() throws Exception{
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.findUserBySex(1);
        System.out.println(userList);
    }

    @Test
    public void findUserByAddressTest() throws Exception{
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.findUserByAddress("江苏镇江");
        System.out.println(userList);
    }*/
}
