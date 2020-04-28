package org.example.controller;

import org.example.pojo.Guest;
import org.example.service.GuestService;
import org.example.service.impl.GuestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;

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
        List<Guest> list = this.service.list();
        mav.addObject("list", list);
        mav.setViewName("list");
        return mav;
    }
}
