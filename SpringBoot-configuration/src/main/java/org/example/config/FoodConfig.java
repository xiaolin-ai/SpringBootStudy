package org.example.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: aixiaolin
 * @Date: 2020-04-26 14:38
 * @Description: 从配置文件中读取相应值赋予对应属性，相当于将spring配置文件中bean对象创建
 */
@Data
@ConfigurationProperties(prefix = "food")
public class FoodConfig {
    private String rice;
    private String meat;
    private String[] sauce;

    public FoodConfig() {
        System.out.println("constructor !");
    }
}
