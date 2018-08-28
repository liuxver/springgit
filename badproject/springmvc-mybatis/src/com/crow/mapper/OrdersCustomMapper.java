package com.crow.mapper;

import com.crow.po.Orders;
import com.crow.po.OrdersCustom;
import com.crow.po.User;

import java.util.List;

/**
 * created by liuxv on 2018/5/3
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
public interface OrdersCustomMapper {
    //查询订单关联查询用户信息
    public List<OrdersCustom> findOrdersUser()throws Exception;

    //使用resultmap查询订单关联用户信息
    public List<Orders> findOrdersUserResultMap();

    //使用 resultmap查询 订单关联细节，用户信息
    public List<Orders> findOrderAndDetailResultMap();

    //查询用户购买商品信息
    public List<User>  findUserAndItemsResultMap()throws Exception;


}
