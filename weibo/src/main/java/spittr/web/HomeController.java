package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * created by liuxv on 2018/7/20
 * email:liuxver444@gmail.com
 * qq:1369058574
 */

@Controller  //声明控制器
@RequestMapping({"/","/home"})
public class HomeController {
    @RequestMapping(method = GET)
    public String home(){
        return "home";
    }
}
