package com.example.HelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    @GetMapping("/hello")
//    public String getHello() {
//        return "Hello World";
//    }

    @GetMapping("/hello")
    public String getHello(@RequestParam String name) {
        return "Hello " + name;
    }
}
