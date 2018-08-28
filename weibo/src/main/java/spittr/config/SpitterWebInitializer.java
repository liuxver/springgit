package spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import spittr.web.WebConfig;

/**
 * created by liuxv on 2018/7/20
 * email:liuxver444@gmail.com
 * qq:1369058574
 */

public class SpitterWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
    @Override
    protected String[] getServletMappings(){
        return new String[]{"/"};
    }

    @Override
    protected Class<?>[] getRootConfigClasses(){
        return new Class<?>[] {RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses(){
        return new Class<?>[] {WebConfig.class};
    }
}
