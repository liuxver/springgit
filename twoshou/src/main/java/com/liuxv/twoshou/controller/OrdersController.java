package com.liuxv.twoshou.controller;

import com.liuxv.twoshou.po.Goods;
import com.liuxv.twoshou.po.Orders;
import com.liuxv.twoshou.po.User;
import com.liuxv.twoshou.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * created by liuxv on 2018/5/27
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
@Controller
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;

    @RequestMapping("/showOrders")
    public String showOrders(Model model){
        List<Orders> orders=ordersService.findAllOrders();
        model.addAttribute( "ordersList",orders );
        return "orders/showOrders";
    }

    @RequestMapping("/buy")
    public String buy(String name, String uname,String seller, Model model){

        System.out.println( name+"  "+uname+"  "+seller);
        Orders order=new Orders(name,seller,uname);
        System.out.println( order.getName()+"!!!!!!"+order.getSeller()+"!!!!!"+order.getBuyer() );
        ordersService.insertOrders( order );
        List<Orders> orders=ordersService.findOrdersByUser( uname );
        model.addAttribute( "ordersList",orders );
        model.addAttribute( "uname",uname );
        return "orders/showOrders";
    }




    @RequestMapping("/insert")
    public String insert(Model model , Orders orders){
        ordersService.insertOrders( orders );
        return "redirect:/orders/showOrders";
    }

    @RequestMapping("/delete")
    public String delete(String name,String uname, Model model){
        ordersService.deleteOrders( name );
        model.addAttribute( "uname",uname );
        List<Orders> orders=ordersService.findOrdersByUser( uname );
        model.addAttribute( "ordersList",orders );
        return "redirect:/orders/showOrders";
    }


    @RequestMapping("/findOrdersByUser")
    public String findOrdersByUser(String uname,Model model){
        System.out.println( uname );
        List<Orders> orders=ordersService.findOrdersByUser( uname );
        for(int i=0;i<orders.size();i++){
            System.out.println( orders.get( i ).getName() +"+++++++++++++++++++++++++++++++++");
        }
        model.addAttribute( "ordersList",orders );
       model.addAttribute( "uname",uname );
        return "orders/showOrders";
    }



}
