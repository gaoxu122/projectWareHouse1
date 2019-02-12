package com.newpri.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {


    @RequestMapping(value = "/cccc")
    public void testMethod(){
        System.out.println("test.................");
    }
}
