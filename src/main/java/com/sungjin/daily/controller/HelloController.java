package com.sungjin.daily.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
@RequestMapping("daily")
public class
HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello.html";
    }
}
