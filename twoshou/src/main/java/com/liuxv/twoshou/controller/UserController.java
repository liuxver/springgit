package com.liuxv.twoshou.controller;

import com.liuxv.twoshou.po.User;
import com.liuxv.twoshou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * created by liuxv on 2018/5/27
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;




    @RequestMapping("/login")
    public String login(User user,Model model){

        List<User> users=userService.getAllUser();
        user.setUserType( 2 );
        boolean flag=false;
        for (int i=0;i<users.size();i++){
            Set<String> set=new LinkedHashSet<>(  );

            set.add( users.get( i ).getName() );
            set.add( users.get( i ).getPassword() );
            System.out.println( users.get( i ).getName()+" "+user.getName() );
            System.out.println( users.get( i ).getPassword()+" "+user.getPassword() );

            String s1=user.getName();
            String s2=user.getPassword();
            set.add( s1);
            set.add( s2 );
            System.out.println( set.size() );
            if(set.size()==2&&users.get( i ).getUserType()==2){
                flag=true;
                break;
            }
            System.out.println( set.size() );



        }

        System.out.println( flag );
        if(flag){
            model.addAttribute( "name",user.getName() );
            return "userHome";
        }
        else {
            return "login";
        }


    }


    @RequestMapping("/backhome")
    public String backhome(Model model,@RequestParam("name") String name){
        model.addAttribute( "name",name );
        return "userHome";
    }





    @RequestMapping("/adminLogin")
    public String adminLogin(User user,Model model) {
        List<User> users = userService.getAllUser();
        user.setUserType( 2 );
        boolean flag = false;
        for (int i = 0; i < users.size(); i++) {
            Set<String> set = new LinkedHashSet<>();

            set.add( users.get( i ).getName() );
            set.add( users.get( i ).getPassword() );
            System.out.println( users.get( i ).getName() + " " + user.getName() );
            System.out.println( users.get( i ).getPassword() + " " + user.getPassword() );

            String s1 = user.getName();
            String s2 = user.getPassword();
            set.add( s1 );
            set.add( s2 );
            System.out.println( set.size() );
            if (set.size() == 2&&users.get( i ).getUserType()==1) {
                flag = true;
                break;
            }
            System.out.println( set.size() );


        }

        System.out.println( flag );
        if (flag) {
            return "home";
        } else {
            return "adminLogin";
        }


    }




    @RequestMapping("/register")
    public String register(User user,Model model){
        List<User> users=userService.getAllUser();
        user.setUserType( 2 );
        boolean flag=true;
        for (int i=0;i<users.size();i++){
            if(users.get( i ).getName().equals( user.getName() ) ){
                flag=false;
            }
        }
        System.out.println( flag );

        if(flag){
            userService.insertUser( user );
            model.addAttribute( "name",user.getName() );
            return "userHome";
        }
        else {
            return "login";
        }


    }







    @RequestMapping("/showUsers")
    public String showUsers(Model model){
        List<User> users=userService.getAllUser();
        System.out.println( users.size() );
        for(int i=0;i<users.size();i++){
            System.out.println( users.get( i ).getName()+" "+users.get( i ).getPassword() );
        }
        model.addAttribute( "usersList",users );

        return "user/showUsers";
    }


    @RequestMapping("/write")
    public String write(){
        return "user/write";
    }

    @RequestMapping("/insert")
    public String insert(User user,Model model){
        userService.insertUser( user );
        return "redirect:/user/showUsers";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam(value = "name") String name,Model model){
        userService.deleteUser( name );
        return "redirect:/user/showUsers";
    }


}
