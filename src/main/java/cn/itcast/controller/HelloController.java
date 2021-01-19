package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
    @RequestMapping(path = "/test1", method = {RequestMethod.GET})
    public String test1(String msg) {
        System.out.println(msg);
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
     * 绑定复杂参数：JavaBean、List、Map
     */
    @RequestMapping("/test3")
    public String test3(Account account) {
        System.out.println(account);
        return "success";
    }

    /**
     * 自定义类型转换器
     */
    @RequestMapping("/test4")
    public String test4(User user) {
        System.out.println(user);
        return "success";
    }

    /**
     * 获得原生Servlet的API
     */
    @RequestMapping("/test5")
    public String test5(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        ServletContext servletContext = session.getServletContext();
        System.out.println(request);
        System.out.println(response);
        System.out.println(session);
        System.out.println(servletContext);
        return "success";
    }
}
