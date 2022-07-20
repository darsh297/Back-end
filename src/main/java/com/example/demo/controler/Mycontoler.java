package com.example.demo.controler;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@RestController
public class Mycontoler {
    @GetMapping("/")
    public String gettingDisplay()
    {
        return "Welcome to springboot";
    }
    @GetMapping("/GetTime")
    public Date gettingTime()
    {
        return new Date();
    }
    @GetMapping("/GetLine")
    public ModelAndView welcome() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("darshan.html");
        return modelAndView;
    }

}
