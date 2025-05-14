package com.vti.helloworld.service;

public class HelloWorldService implements IHelloWorldService {

    @Override
    public String helloWorld() {
        return "Hello World";
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
