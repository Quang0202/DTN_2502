package com.vti.helloworld.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService implements IHelloWorldService{

    @Override
    public String helloWorld() {
        return  "Hello World";
    }

    @Override
    public String getAccount() {
        return "";
    }

    @Override
    public String getAccountById(int id) {
        return "";
    }
}
