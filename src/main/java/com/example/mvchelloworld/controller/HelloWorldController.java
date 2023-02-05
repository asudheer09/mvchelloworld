package com.example.mvchelloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("myapp")
public class HelloWorldController {

    @RequestMapping("home")
    public String welcomePage(){
        return "welcom";
    }
}
