package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello() {
        System.out.println("hello spring mvc");
        return "success";
    }

    /**
     * 限制请求方式
     */
    @RequestMapping(path = "/test1", method = {RequestMethod.POST})
    public String test1() {
        return "success";
    }

    /**
     * 配置了参数，请求必须传这个参数，不传则无法访问
     * 若同时配置了参数值，则请求中的参数值必须匹配
     */
    @RequestMapping(path = "/test2", params = {"username=1"})
    public String test2() {
        return "success";
    }

    /**
     * 限制请求头
     */
    @RequestMapping(path = "/test3", headers = {"accept"})
    public String test3() {
        return "success";
    }
}
