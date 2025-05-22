package com.vti.QLNV.controller;


import com.vti.QLNV.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello/")
public class HelloController {

    @Autowired
    private IHelloService helloService;

    @RequestMapping("/")
    public String helloWorld() {
        return helloService.helloWorld();
    }

    @RequestMapping("/hello")
    public String getHello(@RequestParam String name) {
        return "Hello World! " + name;
    }

}
