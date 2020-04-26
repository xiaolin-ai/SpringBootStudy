package org.example.controller;

import org.example.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: aixiaolin
 * @Date: 2020-04-26 22:16
 * @Description:
 */
@Controller
public class ThymeleafController {

    @RequestMapping("/thymeleaf")
    public String thymeleaf(Model model) {
        model.addAttribute("name", "<span style='color:red'>thymeleaf</span>");
        return "/thymeleaf/index";
    }

    @RequestMapping("/thyme")
    public String thyme(Model model) {
        User user = new User("张三", "123456", 20);
        model.addAttribute("user", user);
        return "/thymeleaf/index";
    }

    @RequestMapping("/welcome")
    public String welcome() {
        return "/thymeleaf/welcome";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "hello";
    }
}
