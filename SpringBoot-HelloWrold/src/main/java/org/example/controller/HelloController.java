package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



/**
 * @Author: aixiaolin
 * @Date: 2020-04-26 0:27
 * @Description:
 */
@Controller
public class HelloController {

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        //return "Hello World !";
        return "Hello Java !";
    }


}
