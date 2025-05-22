package com.vti.helloworld.controller;

import com.vti.helloworld.entity.Department;
import com.vti.helloworld.service.IHelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/hello/")
public class HelloWorldController {

    @Autowired
    private IHelloWorldService helloWorldService;

    @GetMapping("/")
    public String helloWorld(){
        return helloWorldService.helloWorld();
    }

    @GetMapping("/account")
    public String getAccount(){
        return "Get account";
    }

    @GetMapping("/account_id/{id}")
    public String getAccountById(@PathVariable int id){
        return "Get account id: "+ id;
    }

    @PostMapping("/create")
    public Department createAccount(@RequestBody Department department){
        System.out.println(department);
        return department;
    }


}
