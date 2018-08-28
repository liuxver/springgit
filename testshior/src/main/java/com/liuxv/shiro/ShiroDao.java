package com.liuxv.shiro;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * created by liuxv on 2018/8/7
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
public class ShiroDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }

    /*
    根据用户名查询密码
     */
    public String getPasswordByUserName(String username){
        String sql="select password from user where username= ?";
        String password=jdbcTemplate.queryForObject( sql,String.class,username );
        return password;
    }



    /*
    查询当前用户的对应权限。
     */
    public List<String> getPermissionByUserName(String username){
        String sql="select p.permname from role_permission p inner join user_role r on p.rolename=r.rolename where r.username=?";
        List<String> perms=jdbcTemplate.queryForList( sql,String.class,username );
        return perms;
    }




}
