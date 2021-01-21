package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/anno")
@SessionAttributes("msg") // 将msg存入session域
public class AnnoController {

    /**
     * RequestParam
     * 可指定参数的名字，以及是否必须
     */
    @RequestMapping("/t1")
    public String test1(@RequestParam("name") String username) {
        System.out.println(username);
        return "success";
    }

    /**
     * RequestBody
     * 获取请求体，get请求不适用
     */
    @RequestMapping("/t2")
    public String test2(@RequestBody String body) {
        System.out.println(body);
        return "success";
    }

    /**
     * PathVariable
     * 占位符
     */
    @RequestMapping("/t3/{id}")
    public String test3(@PathVariable("id") String id) {
        System.out.println(id);
        return "success";
    }



    /**
     * RequestHeader
     * 请求头
     */
    @RequestMapping("/t5")
    public String test5(@RequestHeader("Accept") String header) {
        System.out.println(header);
        return "success";
    }

    /**
     * CookieValue
     * cookie
     */
    @RequestMapping("/t6")
    public String test6(@CookieValue("JSESSIONID") String cookieValue) {
        System.out.println(cookieValue);
        return "success";
    }

    /**
     * ModelAttribute
     * ModelAttribute修饰的方法会先于请求的方法执行
     */
    @RequestMapping("/t7")
    public String test7(@ModelAttribute("u1") User user) {
        System.out.println(user);
        return "success";
    }

    @ModelAttribute
    public void test7_ModelAttribute(User user, Map map) {
        System.out.println("test7_ModelAttribute...");
        Account account1 = new Account();
        User user1 = new User();
        user1.setUname(user.getUname());
        user1.setUage(user.getUage());
        user1.setDate(new Date());
        map.put("u1", user1);
    }


    /**
     * sessionAttributes
     */
    @RequestMapping("/t8")
    public String test8(Model model) {
        // 将msg存入request域中
        model.addAttribute("msg", "美美");
        System.out.println("sessionAttributes...");
        return "sessionAttributes";
    }

    @RequestMapping("/t8_1")
    public String getSessionAttributes(Model model) {
        // 获取msg
        Object msg = model.getAttribute("msg");
        System.out.println(msg);
        return "sessionAttributes";
    }

    @RequestMapping("/t8_2")
    public String deleteSessionAttributes(SessionStatus status) {
        // 删除session
        status.setComplete();
        return "sessionAttributes";
    }
}
