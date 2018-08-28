package spittr.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * created by liuxv on 2018/7/20
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
@Configuration
@EnableWebMvc
@ComponentScan("spittr.web")
public class WebConfig extends WebMvcConfigurerAdapter{
    @Bean
    public ViewResolver viewResolver(){//配置jsp视图解析器
        InternalResourceViewResolver resolver=new InternalResourceViewResolver(  );
        resolver.setPrefix( "/WEB-INF/views/" );
        resolver.setSuffix( ".jsp" );



        /**
         * setExposeContextBeansAsAttributes
         *设置是否可以访问应用程序上下文中的所有Spring bean
         *作为请求属性，一旦访问属性，通过延迟检查。
         * <p>这将使所有这些bean都可以在{@code $ {...}}中访问
         * JSP 2.0页面中的表达式，以及JSTL的{@code c：out}中的表达式
         *值表达式。
         * <p>默认为“false”。
         * @see AbstractView #setExposeContextBeansAsAttributes
         */
        resolver.setExposeContextBeansAsAttributes( true );
        return resolver;
    }


    @Override//配置对静态资源的处理，这里表示，静态资源的请求转发到默认的servlet上面，不用DispatcherServlet本身来处理此类请求
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
        configurer.enable();
    }

}
