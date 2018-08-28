package com.liuxv.tws.controller;

import com.liuxv.tws.po.Robot;
import com.liuxv.tws.po.User;
import com.liuxv.tws.service.RobotService;
import com.liuxv.tws.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * created by liuxv on 2018/6/12
 * email:liuxver444@gmail.com
 * qq:1369058574
 */


@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private RobotService robotService;


    @RequestMapping("/login")
    public String login(Model model,User user){
        List<User> users= userService.getAllUser();
        //user.setUserType( 2 );
        boolean flag=false;

        //Employee u=null;
        User u=null;
        //int type=-1;
        for (int i=0;i<users.size();i++){
            Set<String> set=new LinkedHashSet<>(  );

            set.add( users.get( i ).getId() );
            set.add( users.get( i ).getPassword() );
            System.out.println( users.get( i ).getId()+" "+user.getId() );
            System.out.println( users.get( i ).getPassword()+" "+user.getPassword() );

            String s1=user.getId();
            String s2=user.getPassword();
            set.add( s1);
            set.add( s2 );
            System.out.println( set.size() );
            if(set.size()<2){
                flag=true;
                //type=users.get( i ).getDepartment();
                u=users.get( i );
                break;
            }
            System.out.println( set.size() );



        }

        System.out.println( flag );
        if(flag){
            model.addAttribute( "user",u);
            System.out.println( u.getName()+" "+u.getType()  );
            if(u.getType()==8){
                List<Robot> list1=robotService.getAllRobot();
                for(int i=0;i<list1.size();i++){
                    System.out.println( list1.get( i ).getName()+" : "+list1.get( i ).getStatus() );
                }

                for(int i=0;i<list1.size();i++){
                    if(list1.get( i ).getStatus()==0){
                        list1.remove( i );
                        i--;
                    }
                }
                for(int i=0;i<list1.size();i++){
                    System.out.println( list1.get( i ).getName()+" : "+list1.get( i ).getStatus() );
                }

                model.addAttribute( "list",list1 );

                return "adminHome";
            }

            return "userHome";
        }
        else {

            return "login";
        }

    }
}
