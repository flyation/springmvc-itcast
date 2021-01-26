package cn.itcast.controller;

import cn.itcast.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/exception")
public class ExceptionController {

    @RequestMapping("/test1")
    public String test1(HttpServletRequest requset) throws SysException {
        try {
            int i = 1 / 0;
        } catch (Exception e) {
            e.printStackTrace();
            throw new SysException("我一个小小的数字1怎么能除以0呢？");
        }
        return "success";
    }
}
