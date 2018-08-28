package com.liuxv.fenbushi.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by liuxv on 2018/6/27
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
@Controller
public class HomeController {

    @RequestMapping("/login")
    public String login(Model model){
        return "login";
    }


    @RequestMapping("/register")
    public String register(Model model){
        return "register";
    }
}
