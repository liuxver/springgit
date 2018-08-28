package spittr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.type.filter.RegexPatternTypeFilter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.context.annotation.ComponentScan.Filter;
import spittr.config.RootConfig.WebPackage;

import java.util.regex.Pattern;

import java.util.regex.Pattern;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.core.type.filter.RegexPatternTypeFilter;

import spittr.config.RootConfig.WebPackage;


/**
 * created by liuxv on 2018/7/20
 * email:liuxver444@gmail.com
 * qq:1369058574
 */

@Configuration
@Import(DataConfig.class)
@ComponentScan(basePackages = {"spittr"},
        excludeFilters = {
            @Filter(type=FilterType.CUSTOM,value = WebPackage.class)
        })

public class RootConfig {
    public static class WebPackage extends RegexPatternTypeFilter{
        public WebPackage(){
            super( Pattern.compile("spittr\\.web"));
        }
    }
}
