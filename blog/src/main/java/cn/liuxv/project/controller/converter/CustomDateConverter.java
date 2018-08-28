package cn.liuxv.project.controller.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * created by liuxv on 2018/5/11
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
public class CustomDateConverter implements Converter<String,Date> {

    @Override
    public Date convert(String source) {

        //实现将日期串转成日期类型yyyy-MM-dd HH:mm:ss

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            return simpleDateFormat.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //如果参数绑定失败返回null
        return null;
    }

}