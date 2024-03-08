package com.spring.springbootmvcwebapp.controller;

import com.spring.springbootmvcwebapp.model.Alien;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.security.PublicKey;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        System.out.println("Home Controller");
        return "index";
    }

    @RequestMapping("/alien")
    public String homeAlien(){
        System.out.println("Alien Home Controller");
        return "indexAlien";
    }

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("num1") int i, @RequestParam("num2") int j){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("result");

        int num3 = i + j;
        mv.addObject("num3", num3);

        return mv;
    }

    @RequestMapping("/addAlien")
    public String addAlien(@ModelAttribute("a") Alien a){
        return "resultAlien";
    }

}
