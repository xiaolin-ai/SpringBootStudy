package org.example.controller;

import org.example.config.FoodConfig;
import org.example.config.VegetablesConfig;
import org.example.pojo.Food;
import org.example.pojo.Vegetables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: aixiaolin
 * @Date: 2020-04-26 14:26
 * @Description:
 *
 * 注解 RestController 是注解Controller和注解ResponseBody的组合
 * 表明返回json形式的响应结果   而不是视图(jsp html)
 */
@RestController
public class JsonController {

    @RequestMapping("/food")
    public Food getFood() {
        Food food = new Food();
        food.setMeat("红烧肉");
        food.setRice("蛋炒饭");
        return food;
    }

    /**
     * 通过value注解从配置文件中读取对应的值赋给属性
     */
    @Value("${food.meat}")
    private String meat;
    @Value("${food.rice}")
    private String rice;

    @RequestMapping("/foods")
    public Food getFoods() {
        Food food = new Food();
        food.setMeat(meat);
        food.setRice(rice);
        return food;
    }


    /**
     * 类似于spring中的bean
     */
    @Autowired
    private FoodConfig config;

    @RequestMapping("/food3")
    public Food getFood3() {
        Food food = new Food();
        food.setMeat(config.getMeat());
        food.setRice(config.getRice());
        food.setSauce(config.getSauce());
        return food;
    }
    @Autowired
    private VegetablesConfig vegetablesConfig;

    @RequestMapping("/vegetables")
    public Vegetables getVegetables() {
        Vegetables vegetables = new Vegetables();
        vegetables.setEggplant(vegetablesConfig.getEggplant());
        vegetables.setGreenPepper(vegetablesConfig.getGreenPepper());
        vegetables.setPotato(vegetablesConfig.getPotato());
        return vegetables;
    }


    @Value("${info.username}")
    private String username;
    @Value("${info.password}")
    private String password;

    @RequestMapping("/jasypt")
    public String jasypt() {
        return username + "\n" + password;
    }
}
