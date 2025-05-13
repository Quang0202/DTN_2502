package com.vti.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class HelloworldController {

    @GetMapping("/")
    public String getHello(){
        return "hello world";
    }

    @GetMapping("/")
    public String getHello(@RequestParam String name){
        return "hello world " + name;
    }

    @GetMapping("/account")
    public String mainPage2(){
        return "hello world account";
    }

}
