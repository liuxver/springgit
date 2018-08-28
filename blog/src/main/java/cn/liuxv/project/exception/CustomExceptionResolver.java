package cn.liuxv.project.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * created by liuxv on 2018/5/11
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
public class CustomExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {

        ModelAndView modelAndView = new ModelAndView();
        if(e instanceof IOException) {
            modelAndView.addObject("message", "IOException");
            modelAndView.setViewName("error/error");
        }
        else if(e instanceof SQLException) {
            modelAndView.addObject("message", "SQLException");
            modelAndView.setViewName("error/error");
        } else {
            e.getMessage();
            modelAndView.addObject("message", e.getMessage());
            modelAndView.setViewName("error/error");
        }
        return modelAndView;

    }

}
