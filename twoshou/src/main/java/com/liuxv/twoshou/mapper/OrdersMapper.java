package com.liuxv.twoshou.mapper;

import com.liuxv.twoshou.po.Orders;
import com.liuxv.twoshou.po.OrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdersMapper {
    int countByExample(OrdersExample example);

    int deleteByExample(OrdersExample example);

    int deleteByPrimaryKey(String name);

    int insert(Orders record);

    int insertSelective(Orders record);

    List<Orders> selectByExample(OrdersExample example);

    List<Orders> getAllOrders();


    List<Orders> findOrdersByName(String name);



    Orders selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
}