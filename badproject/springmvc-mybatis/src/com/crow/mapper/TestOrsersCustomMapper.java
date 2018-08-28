package com.crow.mapper;

import com.crow.po.Orders;
import com.crow.po.OrdersCustom;
import com.crow.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * created by liuxv on 2018/5/3
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
public class TestOrsersCustomMapper {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws Exception {
        // 创建sqlSessionFactory

        // mybatis配置文件
        String resource = "SqlMapConfig.xml";
        // 得到配置文件流
        InputStream inputStream = Resources.getResourceAsStream(resource);

        // 创建会话工厂，传入mybatis的配置文件信息
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testFindOrdersUser() throws Exception {

        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 创建代理对象
        OrdersCustomMapper ordersCustomMapper = sqlSession.getMapper(OrdersCustomMapper.class);

        // 调用maper的方法
        List<OrdersCustom> list = ordersCustomMapper.findOrdersUser();

        System.out.println(list);//在此处打断点

        sqlSession.close();
    }



    @Test
    public void testFindOrdersUserResultMap() throws Exception {

        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 创建代理对象
        OrdersCustomMapper ordersCustomMapper = sqlSession.getMapper(OrdersCustomMapper.class);

        // 调用maper的方法
        List<Orders> list = ordersCustomMapper.findOrdersUserResultMap();

        System.out.println(list);

        sqlSession.close();
    }







    @Test
    public void testFindOrderAndDetailResultMap() throws Exception{
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersCustomMapper ordersCustomMapper = sqlSession.getMapper(OrdersCustomMapper.class);
        List<Orders> ordersList = ordersCustomMapper.findOrderAndDetailResultMap();
        System.out.println(ordersList);
        sqlSession.close();
    }




    @Test
    public void testfindUserAndItemsResultMap() throws Exception{
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersCustomMapper ordersCustomMapper = sqlSession.getMapper(OrdersCustomMapper.class);
        List<User> userList = ordersCustomMapper.findUserAndItemsResultMap();
        System.out.println(userList);
        sqlSession.close();
    }

}
