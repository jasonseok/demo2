package com.example.demo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo2Controller{
    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }    

    @RequestMapping("/test")
    public String test(){
        return "test";
    }

}
