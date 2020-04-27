package org.example.controller;

import org.example.pojo.Guest;
import org.example.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: aixiaolin
 * @Date: 2020-04-27 1:04
 * @Description:
 */
@Controller
public class GuestController {
    @Autowired
    private GuestService service;

    @RequestMapping("/list")
    public ModelAndView getList() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("list", this.service.list());
        mav.setViewName("list");
        return mav;
    }

    @RequestMapping("/toAdd")
    public String toAdd() {
       return "add";
    }

    @RequestMapping("/add")
    public String add(Guest guest) {
        System.out.println(guest);
        this.service.add(guest);
        return "redirect:list";
    }
    @RequestMapping("/delete")
    public String delete(String name) {
        this.service.delete(name);
        return "redirect:list";
    }

    @RequestMapping("/toUpdate")
    public ModelAndView toUpdate(String name) {
        Guest guest = this.service.getGuest(name);
        ModelAndView mav = new ModelAndView();
        if (guest != null) {
            mav.addObject("guest", guest);
        }
        mav.setViewName("update");
        return mav;
    }

    @RequestMapping("/update")
    public String delete(Guest guest) {
        this.service.update(guest);
        return "redirect:list";
    }
}
