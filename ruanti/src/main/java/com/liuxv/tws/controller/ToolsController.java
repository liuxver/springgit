package com.liuxv.tws.controller;

import com.liuxv.tws.po.Atool;
import com.liuxv.tws.po.Btool;
import com.liuxv.tws.po.User;
import com.liuxv.tws.service.UserService;
import com.liuxv.tws.service.AtoolService;
import com.liuxv.tws.service.BtoolService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * created by liuxv on 2018/6/12
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
@Controller
@RequestMapping("/tools")
public class ToolsController {
    @Autowired
    private UserService userService;

    @Autowired
    private BtoolService btoolService;

    @Autowired
    private AtoolService atoolService;


    @RequestMapping("/showAtool")
    public String showAtools(Model model,String user){
        List<Atool> list= atoolService.getAllAtool();
        User u=userService.getUserById( user );

        int a=u.getType();

        System.out.println( a!=0 );
        if(a!=0){
            for(int i=0;i<list.size();i++){
                System.out.println( "111"+(list.get( i ).getType()!=a) );
                if(list.get( i ).getType()!=a){
                    list.remove( i );
                    i--;
                }
            }
        }

        for(int i=0;i<list.size();i++){
            System.out.println( list.get( i ).getName()+"!!!!!!" +list.get( i ).getType());
        }

        model.addAttribute( "user",u );
        model.addAttribute( "list",list );
        return "showAtool";

    }

    @RequestMapping("/showBtool")
    public String showBtools(Model model,String user){
        List<Btool> list= btoolService.getAllBtool();

        User u=userService.getUserById( user );
        final int a=u.getType();

        System.out.println( a );
        System.out.println( list.size() );
        if(a!=0){
            for(int i=0;i<list.size();i++){
                System.out.println( list.get( i ).getType()+"--------------"+a );
               // System.out.println( a );
                System.out.println( list.get( i ).getType()!=a );
                if(list.get( i ).getType()!=a){
                    //list.remove( i );
                    System.out.println( list.size() );
                    Btool btool=list.remove( i );
                    System.out.println( list.size() );
                    i--;
                }
                System.out.println( i );
            }
        }



        for(int i=0;i<list.size();i++){
            System.out.println( list.get( i ).getName()+"!!!!!!" +list.get( i ).getType());
        }

        model.addAttribute( "user",u );
        model.addAttribute( "list",list );
        return "showBtool";
    }






    @RequestMapping("query")
    public String query(Model model,String user,String name){

        User u=userService.getUserById( user );

        String searchText = new StringBuilder("%").append(name).append("%").toString();

        System.out.println( searchText );

        List<Btool> list=btoolService.getBtoolByName( searchText );

        int a=u.getType();

        if(a!=0){
            for(int i=0;i<list.size();i++){
                if(list.get( i ).getType()!=a){
                    list.remove( i );
                    i--;
                }
            }
        }

        for(int i=0;i<list.size();i++){
            System.out.println( list.get( i ).getName()+"!!!!!!" +list.get( i ).getType());
        }

        model.addAttribute( "user",u );
        model.addAttribute( "list",list );
        return "showBtool";
    }




}
