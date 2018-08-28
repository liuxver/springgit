package com.liuxv.tws.controller;

import com.liuxv.tws.po.Atoolorder;
import com.liuxv.tws.po.User;
import com.liuxv.tws.service.AtoolorderService;
import com.liuxv.tws.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by liuxv on 2018/6/15
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
@Controller
@RequestMapping("/Atoolorder")
public class AtoolorderController {
    @Autowired
    private AtoolorderService atoolorderService;

    @Autowired
    private UserService userService;

    @RequestMapping("/insert")
    public String insert(Model model, String user, Atoolorder atoolorder){
        User u=userService.getUserById( user );


        model.addAttribute( "user",u );
        return "userHome";
    }
}
