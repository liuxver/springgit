package com.liuxv.tws.service;

import com.liuxv.tws.po.Orders;
import org.aspectj.weaver.ast.Or;

import java.util.List;

/**
 * created by liuxv on 2018/6/12
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
public interface OrdersService {
    public List<Orders> getAllOrders();

    public void insert(Orders orders);

    public void update(Orders orders);

    public void delete(int id);

    public Orders getOrdersById(int id);
}
