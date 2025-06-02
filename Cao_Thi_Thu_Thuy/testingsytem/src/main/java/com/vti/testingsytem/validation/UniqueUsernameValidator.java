package com.vti.testingsytem.validation;

import com.vti.testingsytem.entity.UniqueUsername;
import com.vti.testingsytem.repository.IAccountRepository;
import com.vti.testingsytem.service.IAccountService;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class UniqueUsernameValidator implements ConstraintValidator<UniqueUsername, String> {

    @Autowired
    private IAccountService accountService;

    @Override
    public boolean isValid(String username, ConstraintValidatorContext context) {
        return !accountService.existsByUsername(username);
    }
}
