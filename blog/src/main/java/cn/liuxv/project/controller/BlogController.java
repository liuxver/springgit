package cn.liuxv.project.controller;

import cn.liuxv.project.po.blog.Blog;
import cn.liuxv.project.service.BlogService;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * created by liuxv on 2018/5/10
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
@Controller
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @RequiresRoles("blogger")
    @RequestMapping("/write")
    public String write() {
        return "blog/write";
    }

    @RequiresRoles("blogger")
    @RequestMapping(value = "/submit",method = RequestMethod.POST)
    public String submit(Blog blog, Model model) {
        blogService.insertBlog(blog);
        //blogService.getBlogByTitle(blog.getTitle());
        //blogService.updateAlterTime(blog.getId(),blog);
        return "redirect:/";
    }

    @RequiresRoles( "blogger" )
    @RequestMapping(value="/edit",method = RequestMethod.POST)
    public String edit(@RequestParam(value = "blog_id",required = true) Integer id,Model model){
        Blog blog=blogService.getBlogById( id );
        model.addAttribute( blog );
        return "blog/edit";
    }


    @RequiresRoles( "blogger" )
    @RequestMapping(value = "/editCommit",method = RequestMethod.POST)
    public String editCommit(@RequestParam(value = "blog_id",required = true) Integer id,Model model,Blog blog){
        blogService.editBlog( blog );
        return "redirect:/";
    }









}
