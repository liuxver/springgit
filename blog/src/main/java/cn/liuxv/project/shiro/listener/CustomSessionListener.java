package cn.liuxv.project.shiro.listener;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.SessionListener;

/**
 * created by liuxv on 2018/5/19
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
public class CustomSessionListener implements SessionListener {

    //private ShiroSessionRepository shiroSessionRepository;

    @Override
    public void onStart(Session session) {
        System.out.println("on start");
    }

    @Override
    public void onStop(Session session) {
        System.out.println("on stop");
    }

    @Override
    public void onExpiration(Session session) {
        System.out.println("on expiration");
    }


}
