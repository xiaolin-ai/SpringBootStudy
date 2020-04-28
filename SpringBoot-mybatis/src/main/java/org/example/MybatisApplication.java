package org.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("org.example.dao")//mybatis自带的扫描器
/**
 * 以下是tk.mybatis插件的扫描器
 */
@tk.mybatis.spring.annotation.MapperScan("org.example.dao")
public class MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class, args);
    }

}
