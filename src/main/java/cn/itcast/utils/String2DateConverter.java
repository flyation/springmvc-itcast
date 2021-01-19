package cn.itcast.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class String2DateConverter implements Converter<String, Date> {

    @Override
    public Date convert(String s) {
        if (s == null) {
            throw new RuntimeException("请输入日期");
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy~MM~dd");
        Date date;
        try {
            date = sdf.parse(s);
            return date;
        } catch (ParseException e) {
            throw new RuntimeException("日期格式错误");
        }
    }
}
