package com.gwhn.gzchart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class GzController {

    @RequestMapping("index")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:gz.html");
        return modelAndView;
    }

    @RequestMapping("index1")
    public ModelAndView index1(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:globe.html");
        return modelAndView;
    }

    @RequestMapping("gzglobe")
    public ModelAndView globeEarth(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:gzglobe.html");
        return modelAndView;
    }

    @RequestMapping("3dchart")
    public ModelAndView get3Dchart(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:3dchart.html");
        return modelAndView;
    }

}
