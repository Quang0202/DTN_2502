package com.vti.helloworld.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

@Service
@Scope(value = WebApplicationContext.SCOPE_APPLICATION)
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
