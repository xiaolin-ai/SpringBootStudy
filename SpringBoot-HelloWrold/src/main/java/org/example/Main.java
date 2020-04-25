package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: aixiaolin
 * @Date: 2020-04-26 0:25
 * @Description: 是整个程序的入口
 * @SpringBootApplication 声明我们的入口类  并且声明当前项目是springboot项目的
 */
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        //使用SpringApplication类的静态方法  启动springboot程序
        //方法的参数  程序的入口类  main函数的参数
        SpringApplication.run(Main.class, args);
    }
}
