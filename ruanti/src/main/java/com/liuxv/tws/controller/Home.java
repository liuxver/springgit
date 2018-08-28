package com.liuxv.tws.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by liuxv on 2018/6/12
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
@Controller

public class Home {
    @RequestMapping("/login")
    public String login(Model model){
        return "login";
    }

    @RequestMapping("/login1")
    public String login1(Model model){
        return "login";
    }
}
