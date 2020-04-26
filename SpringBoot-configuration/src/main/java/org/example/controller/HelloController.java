package org.example.controller;

import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: aixiaolin
 * @Date: 2020-04-26 14:08
 * @Description:
 */
@RestController
public class HelloController {

    public String sayHello() {
        return  "hello !";
    }
}
