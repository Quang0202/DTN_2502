package vti.accountmanagement.anotation.execute;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import vti.accountmanagement.anotation.ValidateEnum;

import java.util.List;
import java.util.stream.Stream;

public class ValidateEnumExecute implements ConstraintValidator<ValidateEnum, CharSequence> {
    private List<String> acceptedValues;

    @Override
    public void initialize(ValidateEnum validateEnum) {
        acceptedValues = Stream.of(validateEnum.enumClass().getEnumConstants())
                .map(Enum::name)
                .toList();
    }

    @Override
    public boolean isValid(CharSequence value, ConstraintValidatorContext constraintValidatorContext) {
        if (value == null) {
            return true;
        }
        return acceptedValues.contains(value.toString().toUpperCase());
    }
}
