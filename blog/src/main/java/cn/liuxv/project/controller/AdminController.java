package cn.liuxv.project.controller;

import cn.liuxv.project.po.user.UserCustom;
import cn.liuxv.project.po.user.UserQueryVo;
import cn.liuxv.project.service.UserService;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.eis.SessionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
import java.util.List;

/**
 * created by liuxv on 2018/5/10
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private UserService userService;

    @Autowired
    private SessionDAO sessionDAO;

    @RequestMapping
    private String admin() {
        return "admin/home";
    }

    //查看注册用户
    @RequiresRoles(value={"blogger","administrator"},logical = Logical.OR)
    @RequestMapping("/checkUserList")
    private String checkUserList(UserQueryVo userQueryVo, Model model) {
        List<UserCustom> userList = userService.getUserList(userQueryVo);
        model.addAttribute("userList", userList);
        return "admin/userList";
    }

    //查看正在登录的用户
    @RequiresRoles(value={"blogger","administrator"},logical = Logical.OR)
    @RequestMapping("/checkSessionList")
    private String checkSessionList() {
        Collection<Session> sessions = sessionDAO.getActiveSessions();
        System.out.println(sessions.size());
        return null;
    }

}
