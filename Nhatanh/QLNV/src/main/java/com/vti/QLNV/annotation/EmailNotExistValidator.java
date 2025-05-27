package com.vti.QLNV.annotation;

import com.vti.QLNV.service.IAccountService;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
public class EmailNotExistValidator implements ConstraintValidator<EmailNotExist, String> {

    @Autowired
    private IAccountService accountService;

    @SuppressWarnings("deprecation")
    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        if (StringUtils.isEmpty(email)) {
            return true;
        }

        return !accountService.isEmailExist(email);
    }
}
