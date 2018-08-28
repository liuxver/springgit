package com.liuxv.fenbushi.controller;

import com.liuxv.fenbushi.mapper.UserMapper;
import com.liuxv.fenbushi.po.Account;
import com.liuxv.fenbushi.po.User;
import com.liuxv.fenbushi.service.AccountService;
import com.liuxv.fenbushi.service.UserService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private AccountService accountService;


    @Autowired
    private UserMapper userMapper;




    @RequestMapping("/login")
    public String login(Model model, User user){
        System.out.println( user.getName() );

        User u=userMapper.selectByPrimaryKey( "liuxv" );
        System.out.println( u.getName(  ));

        List<User> list=userService.getAllUser();
        System.out.println(list.size()  );
        boolean flag=false;
        for(int i=0;i<list.size();i++){
            if(list.get( i ).getName().equals( user.getName() )){
                if(list.get( i ).getPassword().equals( user.getPassword() )){
                    flag=true;
                }
            }
        }


        if(flag){
            System.out.println( user.getName() );
            List<Account> list1=accountService.getAccountByName( user.getName() );
            model.addAttribute( "list",list1 );
            model.addAttribute( "user",user.getName() );
            return "home";
        }else{
            return "login";
        }


    }




    @RequestMapping("/register")
    public String register(Model model,User user){
        List<User> list=userService.getAllUser();
        boolean flag=true;
        for(int i=0;i<list.size();i++){
            if(list.get( i ).getName().equals( user.getName() )){
                //if(list.get( i ).getPassword().equals( user.getPassword() )){
                    flag=false;
                //}
            }
        }


        if(flag){
            userService.insert( user );
            model.addAttribute( "user",user.getName() );
            return "home";
        }else{
            return "register";
        }
    }



    @RequestMapping("/withdraw")
    public String withdraw(Model model,String account,String user){
        Account a=accountService.getAccountByAccount( account );
        model.addAttribute( "account",a );
        model.addAttribute( "user",user );
        return "withdraw";
    }


    @RequestMapping("/submit")
    public String submit(Model model,String account,String user,String m){

        Account acc=accountService.getAccountByAccount( account );
        int a=Integer.parseInt( m );
        System.out.println( a );

        int b=acc.getMoney();
        System.out.println( b );
        System.out.println( acc.getAccount() );
        if(a>b){
            List<Account> list1=accountService.getAccountByName( user);
            model.addAttribute( "list",list1 );
            model.addAttribute( "user",user );
            return "home";
        }

        acc.setMoney( b-a );
        System.out.println( acc.getMoney() );
        accountService.update( acc );
        List<Account> list1=accountService.getAccountByName( user);
        model.addAttribute( "list",list1 );
        model.addAttribute( "user",user );
        return "home";

    }




    @RequestMapping("/create")
    public String create(Model model,String account,String user,Account a){
        a.setMoney( 99999 );
        a.setUser( user );
        a.setAccount( account );
        accountService.insert( a );
        List<Account> list1=accountService.getAccountByName( user);
        model.addAttribute( "list",list1 );
        model.addAttribute( "user",user );
        return "home";
    }


}
