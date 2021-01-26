package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/interceptor")
public class InterceptorController {

    @RequestMapping("/test1")
    public String test1(HttpServletRequest requset) {
        System.out.println("InterceptorController执行了。。。");
        return "success";
    }
}
