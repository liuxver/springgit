package com.liuxv.twoshou.service;

import com.liuxv.twoshou.po.Orders;
import com.liuxv.twoshou.po.User;

import java.util.List;

/**
 * created by liuxv on 2018/5/27
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
public interface OrdersService {
    public List<Orders> findAllOrders();

    public List<Orders> findOrdersByUser(String name);

    public void insertOrders(Orders orders);

    public void deleteOrders(String name);

}
