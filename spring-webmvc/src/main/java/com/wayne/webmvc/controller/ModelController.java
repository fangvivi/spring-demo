package com.wayne.webmvc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author wayne
 */
@Controller
@Slf4j
public class ModelController {

    static final String VIEW_NAME = "index";
    @GetMapping("/a")
    public ModelAndView modelAndView(){
        log.info("收到了请求");
        ModelAndView mv = new ModelAndView(VIEW_NAME);
        mv.addObject("data","ModelAndView");
        return mv;
    }

    @GetMapping("/b")
    public String modelMap(ModelMap modelMap){
        modelMap.addAttribute("data","ModelMap");
        return VIEW_NAME;
    }

    @GetMapping("/c")
    public String model(Model model){
        model.addAttribute("data","model");
        return VIEW_NAME;
    }



}
