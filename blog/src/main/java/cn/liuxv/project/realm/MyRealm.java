package cn.liuxv.project.realm;

import cn.liuxv.project.po.user.UserCustom;
import cn.liuxv.project.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * created by liuxv on 2018/5/19
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
public class MyRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;



    /**
     * 授权
     * @param principals
     * @return
     */

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String userName=(String)principals.getPrimaryPrincipal();
        SimpleAuthorizationInfo authorizationInfo=new SimpleAuthorizationInfo();
        authorizationInfo.setRoles(userService.getRolesByUserName(userName));
        authorizationInfo.setStringPermissions(userService.getPermissionsByUserName(userName));
        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String userName=(String)token.getPrincipal();
        UserCustom userCustom= userService.getByUserName(userName);
        if(userCustom == null) {
            throw new UnknownAccountException();
        }
        if(Boolean.TRUE.equals(userCustom.getLocked())) {
            throw new LockedAccountException();
        }
        SimpleAuthenticationInfo authcInfo=new SimpleAuthenticationInfo(userCustom.getUsername(),userCustom.getPassword(),"realm");
        authcInfo.setCredentialsSalt( ByteSource.Util.bytes(userCustom.getUsername()+userCustom.getSalt()));
        return authcInfo;
    }
}
