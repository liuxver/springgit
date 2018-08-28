package com.liuxv.twoshou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by liuxv on 2018/5/28
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home(Model model){
        return "home";
    }


    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @RequestMapping("/adminLogin")
    public String adminLogin(){
        return "adminLogin";
    }



}
