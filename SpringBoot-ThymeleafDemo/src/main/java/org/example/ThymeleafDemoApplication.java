package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;
import java.util.HashMap;

/**
 * @Author: aixiaolin
 * @Date: 2020-04-26 23:58
 * @Description: 是整个程序的入口
 * @SpringBootApplication 声明我们的入口类  并且声明当前项目是springboot项目的
 */
@SpringBootApplication
public class ThymeleafDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThymeleafDemoApplication.class, args);
    }

}
