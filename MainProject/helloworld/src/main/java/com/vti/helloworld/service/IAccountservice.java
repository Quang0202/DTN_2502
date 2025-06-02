package com.vti.helloworld.service;


import com.vti.helloworld.request.AccountRequestForm;
public interface IAccountservice {
    void createAccount(AccountRequestForm accountForm, int id) throws Exception;
}
