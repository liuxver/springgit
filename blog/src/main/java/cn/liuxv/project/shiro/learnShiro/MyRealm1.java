package cn.liuxv.project.shiro.learnShiro;

import org.apache.shiro.authc.*;
import org.apache.shiro.realm.Realm;

/**
 * created by liuxv on 2018/6/6
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
public class MyRealm1 implements Realm {

    @Override
    public String getName() {
        return "myrealm1";
    }

    @Override
    public boolean supports(AuthenticationToken authenticationToken) {
        //仅支持UsernamePasswordToken类型的Token
        return authenticationToken instanceof UsernamePasswordToken;

    }

    @Override
    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String username=(String)authenticationToken.getPrincipal();//得到用户名
        String password=new String((char[])authenticationToken.getCredentials());//得到密码

        if(!"zhang".equals( username )){
            throw new UnknownAccountException( "Name error!" );//如果用户名错误
        }

        if(!"123".equals( password )){
            throw new IncorrectCredentialsException( "Password error!" );//如果密码错误
        }



        //如果身份认证验证成功，返回一个AuthenticationInfo实现；
        return new SimpleAuthenticationInfo( username,password,getName() );

    }
}
