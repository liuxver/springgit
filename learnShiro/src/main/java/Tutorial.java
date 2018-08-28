import org.apache.shiro.SecurityUtils;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tutorial{
    private static final transient Logger log= LoggerFactory.getLogger( Tutorial.class );

    public static void main(String[] args){
        log.info( "my first apache shiro application" );

        Factory<SecurityManager> factory=new IniSecurityManagerFactory( "classpath:shiro.ini" );

        SecurityManager securityManager=factory.getInstance();

        SecurityUtils.setSecurityManager( securityManager );



        //get the currently executing user:
        Subject currentUser=SecurityUtils.getSubject();

        //Do some stuff with a Session (no need for a web or EJB container!!!)
        Session session=currentUser.getSession();
        session.setAttribute( "someKey","aValue" );
        String value=(String)session.getAttribute( "someKey" );

        if()








        System.exit( 0 );
    }
}