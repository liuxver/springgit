package com.liuxv.tws.service.impl;

import com.liuxv.tws.mapper.OrdersMapper;
import com.liuxv.tws.po.Orders;
import com.liuxv.tws.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * created by liuxv on 2018/6/12
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersMapper ordersMapper;


    @Override
    public List<Orders> getAllOrders() {
        List<Orders> list=ordersMapper.getAllOrders();
        return list;

    }

    @Override
    public void insert(Orders orders) {
        ordersMapper.insert( orders );
    }



    @Override
    public void update(Orders orders) {
        ordersMapper.updateByPrimaryKey( orders );
    }

    @Override
    public void delete(int id) {
        ordersMapper.deleteByPrimaryKey( id );
    }

    @Override
    public Orders getOrdersById(int id) {
        return ordersMapper.selectByPrimaryKey( id );
    }
}
