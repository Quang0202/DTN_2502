package com.vti.demo.entity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/Hello")
public class Hello {

    @GetMapping("/")
    public String Hello() {
        return "Hello " ;
    }
    @GetMapping("/test")
    public String TestName( String name) {
        return name +"  T est";
    }
}
