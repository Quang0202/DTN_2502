package com.vti.QLNV.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/helloworld")
public class HelloController {

    @RequestMapping("/")
    public String helloWorld() {
        return "Hello World!";
    }

    @RequestMapping("/hello")
    public String getHello(@RequestParam String name) {
        return "Hello World! " + name;
    }

}
