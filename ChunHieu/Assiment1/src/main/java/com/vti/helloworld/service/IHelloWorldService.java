package com.vti.helloworld.service;

import org.springframework.stereotype.Service;

@Service
public interface IHelloWorldService {
    String helloWorld();
    String getAccount();
    String getAccountById( int id);

}
