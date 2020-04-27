package org.example.controller;

import org.example.pojo.Guest;
import org.example.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: aixiaolin
 * @Date: 2020-04-27 1:04
 * @Description:
 */
@Controller
@RequestMapping("/guest")
public class GuestController {
    @Autowired
    private GuestService service;

    @GetMapping
    public ModelAndView getList() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("list", this.service.list());
        mav.setViewName("list");
        return mav;
    }

    @GetMapping("/toAdd")
    public String toAdd() {
       return "add";
    }

    @PostMapping
    public String add(Guest guest) {
        System.out.println(guest);
        this.service.add(guest);
        return "redirect:guest";
    }
    @DeleteMapping("/{name}")
    @ResponseBody
    public String delete(@PathVariable String name) {
        this.service.delete(name);
        System.out.println(name);
        return "success";
    }

    /**
     * 将/guest/toUpdate/{name}格式的url映射到此方法
     * 其中的name属性值  通过注解 @PathVariable("name")映射到方法的属性中
     * 其中的“name” 代表去url中查找的属性值
     * 直译的意思就是  从路径中获取name的值
     */
    @GetMapping("/toUpdate/{name}")
    public ModelAndView toUpdate(@PathVariable String name) {
        Guest guest = this.service.getGuest(name);
        ModelAndView mav = new ModelAndView();
        if (guest != null) {
            mav.addObject("guest", guest);
        }
        System.out.println(guest);
        mav.setViewName("update");
        return mav;
    }

    @PutMapping
    public String update(Guest guest) {
        this.service.update(guest);
        return "redirect:guest";
    }
}
