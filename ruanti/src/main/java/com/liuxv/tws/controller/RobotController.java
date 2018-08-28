package com.liuxv.tws.controller;

import com.liuxv.tws.po.Robot;
import com.liuxv.tws.po.User;
import com.liuxv.tws.service.RobotService;
import com.liuxv.tws.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * created by liuxv on 2018/6/16
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
@Controller
@RequestMapping("/robot")
public class RobotController {
    @Autowired
    private RobotService robotService;
    @Autowired
    private UserService userService;

    @RequestMapping("/repaired")
    public String repaired(Model model, String name, String user, Robot robot){
        User u=userService.getUserById( user );

        robot.setName( name );
        robot.setStatus( 0 );
        robotService.update( robot );


        //int a=robot.getStatus();
        List<Robot> list=robotService.getAllRobot();
        for(int i=0;i<list.size();i++){
            System.out.println( list.get( i ).getStatus()!=1 );
            if (list.get( i ).getStatus()!=1){
                list.remove( i );
                i--;
            }
        }
        model.addAttribute( "list",list );
        model.addAttribute( "user",u );
        return "adminHome";
    }

}
