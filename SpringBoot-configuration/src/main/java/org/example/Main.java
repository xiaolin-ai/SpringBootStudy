package org.example;

import org.example.config.FoodConfig;
import org.example.config.VegetablesConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @Author: aixiaolin
 * @Date: 2020-04-26 12:41
 * @Description:
 */
@SpringBootApplication
@EnableConfigurationProperties({FoodConfig.class, VegetablesConfig.class})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
