package com.vti.QLNV.annotation;

import com.vti.QLNV.service.IAccountService;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

public abstract class UsernameNotExistValidator implements ConstraintValidator<UsernameNotExist, String> {

    @Autowired
    private IAccountService service;

    @SuppressWarnings("deprecation")
    @Override
    public boolean isValid(String username, ConstraintValidatorContext constraintValidatorContext) {
        if (StringUtils.isEmpty(username)) {
            return true;
        }

        return !service.isUsernameExist(username);
    }
}
