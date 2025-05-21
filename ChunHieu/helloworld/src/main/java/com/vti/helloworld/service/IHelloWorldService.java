package com.vti.helloworld.service;

import org.springframework.web.bind.annotation.PathVariable;

public interface IHelloWorldService {
    String helloWorld();
    String getAccount();
    String getAccountById( int id);
}
