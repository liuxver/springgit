package com.liuxv.tws.controller;

import com.liuxv.tws.po.Orders;
import com.liuxv.tws.po.User;
import com.liuxv.tws.service.OrdersService;
import com.liuxv.tws.service.UserService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * created by liuxv on 2018/6/12
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
@Controller
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;

    @Autowired
    private UserService userService;

    @RequestMapping("/insert")
    public String insert(Model model,String  id,String user,Orders orders){

        User u=userService.getUserById( user );

        orders.setBtoolid( id );
        orders.setUid( u.getId() );
        orders.setData( new Date(  ).toString() );
        orders.setStatus( 0 );




        ordersService.insert( orders );
        model.addAttribute( "user",u);
        return "userHome";


    }

    @RequestMapping("/showMyOrders")
    public String showMyLend(Model model,String user){

        User u=userService.getUserById( user );

        List<Orders> list= ordersService.getAllOrders();


        for(int i=0;i<list.size();i++){

            Set<String> set=new LinkedHashSet<>(  );

            set.add( u.getId() );
            System.out.println( u.getId());
            System.out.println( list.get( i ).getUid());

            String s1=list.get( i ).getUid();
            set.add( s1);
            System.out.println( set.size() );
            if(set.size()!=1){
                list.remove( i );
                i--;
            }
           // System.out.println( set.size() );


        }

        for(int i=0;i<list.size();i++){
            if(list.get( i ).getStatus()==2){
                list.remove( i );
                i--;
            }
        }

        model.addAttribute( "user",u );
        model.addAttribute( "list",list );
        return "showOrders";
    }


    @RequestMapping("/return1")
    public String return1(Model model,int id,String user){
        User u=userService.getUserById( user );
        ordersService.delete( id );
        model.addAttribute( "user",u );
        return "userHome";
    }

    @RequestMapping("/check")
    public String check(Model model,String  user){
        User u=userService.getUserById( user );
        List<Orders> list=ordersService.getAllOrders();
        for (int i=0;i<list.size();i++){
            if(list.get( i ).getStatus()!=0){
                list.remove( i );
                i--;
            }
        }
        model.addAttribute( "list",list );
        model.addAttribute( "user",u );
        return "checkOrders";
    }

    @RequestMapping("/checkPass")
    public String checkPass(Model model,String user,int id){
        User u=userService.getUserById( user );
        Orders orders=ordersService.getOrdersById( id );
        orders.setStatus( 1 );
        ordersService.update( orders );

        List<Orders> list=ordersService.getAllOrders();
        for (int i=0;i<list.size();i++){
            if(list.get( i ).getStatus()!=0){
                list.remove( i );
                i--;
            }
        }
        model.addAttribute( "list",list );
        model.addAttribute( "user",u );
        return "checkOrders";

    }



}
