package cn.liuxv.project.controller;

import cn.liuxv.project.po.blog.Blog;
import cn.liuxv.project.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * created by liuxv on 2018/5/11
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
@Controller

public class HomeController {

    @Autowired
    private BlogService blogService;

    @RequestMapping("/home")
    public String home(Model model) {
        List<Blog> blogs = blogService.getAllBlog();
        model.addAttribute("blogs", blogs);
        return "home";
    }

    @ResponseBody
    @RequestMapping("/getblog")
    public List<Blog> getblog(Blog blog) {
        List<Blog> blogs = blogService.getAllBlog();
        return blogs;
    }




}
