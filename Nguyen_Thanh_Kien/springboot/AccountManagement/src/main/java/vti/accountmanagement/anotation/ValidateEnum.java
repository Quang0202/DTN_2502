package vti.accountmanagement.anotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import vti.accountmanagement.anotation.execute.ValidateEnumExecute;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = ValidateEnumExecute.class)
public @interface ValidateEnum {
    String name();
    String message() default "{name} must be one of {enumClass}";
    Class<? extends Enum<?>> enumClass();
    Class<?>[] groups() default {};
}
