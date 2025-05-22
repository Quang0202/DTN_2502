package com.vti.QLNV.service;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

@Service
@Scope(value = WebApplicationContext.SCOPE_APPLICATION)
public class HelloService implements IHelloService {

    @Override
    public String helloWorld() {
        return  "Hello World";
    }

    @Override
    public String getHello(String name) {
        return "Hello World! " + name;
    }
}
