package cn.itcast.controller;

import cn.itcast.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user1")
public class UserController {

    @RequestMapping("/mav")
    public ModelAndView testModelAndView() {
        System.out.println("/use/mav");
        ModelAndView mav = new ModelAndView("success");
        User user = new User();
        user.setUname("美美");
        user.setUage(18);
        mav.addObject("user", user);
        return mav;
    }

    @RequestMapping("/forward")
    public String testForward() {
        return "forward:/WEB-INF/pages/success.jsp";
    }

    @RequestMapping("/redirect")
    public String testRedirect() {
        return "redirect:/redirect.jsp";
    }

    /**
     * 将post请求中的json转换为对象，需要引入jackson
     */
    @PostMapping("/ajax")
    @ResponseBody
    public User testAjax(@RequestBody User user) {
        System.out.println(user);
        user.setUname("jackson");
        user.setUage(99);
        return user;
    }
}
