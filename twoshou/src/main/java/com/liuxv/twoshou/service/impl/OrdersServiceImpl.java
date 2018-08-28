package com.liuxv.twoshou.service.impl;

import com.liuxv.twoshou.mapper.OrdersMapper;
import com.liuxv.twoshou.po.Orders;
import com.liuxv.twoshou.po.OrdersExample;
import com.liuxv.twoshou.po.User;
import com.liuxv.twoshou.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;

import java.util.List;

/**
 * created by liuxv on 2018/5/27
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public List<Orders> findAllOrders() {
       // OrdersExample ordersExample=new OrdersExample();
        List<Orders> orders=ordersMapper.getAllOrders();
        return orders;
    }

    @Override
    public List<Orders> findOrdersByUser(String name) {
      /*  OrdersExample ordersExample=new OrdersExample();
        OrdersExample.Criteria criteria = ordersExample.createCriteria();
        criteria.andBuyerEqualTo( user.getName() );
        List<Orders> orders=ordersMapper.selectByExample( ordersExample );

        OrdersExample ordersExample1=new OrdersExample();
        OrdersExample.Criteria criteria1 = ordersExample.createCriteria();
        criteria1.andSellerEqualTo( user.getName() );
        List<Orders> orders1=ordersMapper.selectByExample( ordersExample );



        orders.addAll( orders1 );*/
      List<Orders> orders=ordersMapper.findOrdersByName(name);

        return orders;
    }

    @Override
    public void insertOrders(Orders orders) {
        ordersMapper.insert( orders );
    }

    @Override
    public void deleteOrders(String name) {
        ordersMapper.deleteByPrimaryKey( name );
    }
}
