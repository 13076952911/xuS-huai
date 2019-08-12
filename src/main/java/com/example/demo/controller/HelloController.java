package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/*
@RestController 等同于下面两个标签
@ResponseBody
@Controller*/

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello Test AotuInit Project!";
    }
}
