package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * @Author: aixiaolin
 * @Date: 2020-04-26 16:51
 * @Description:
 */

@Controller
public class FreeMarkerController {


    @RequestMapping("/demo")
    public String demo(Model model) {
        model.addAttribute("now", new Date().toString());
        return "freemarker/index";
    }
}
