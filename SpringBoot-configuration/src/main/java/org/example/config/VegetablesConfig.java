package org.example.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author: aixiaolin
 * @Date: 2020-04-26 14:55
 * @Description:
 * 注解 Configuration 声明这是一个配置类  在spring中可以替代xml文件
 * 注解 ConfigurationProperties(prefix="vegetables") 声明这是配置文件类  并且声明前缀
 * 注解 PropertySource("") 声明文件对应的地址
 */
@Data
@Configuration
@PropertySource("classpath:vegetables.properties")
@ConfigurationProperties(prefix = "vegetables")
public class VegetablesConfig {
    private String eggplant;
    private String potato;
    private String greenPepper;
}
