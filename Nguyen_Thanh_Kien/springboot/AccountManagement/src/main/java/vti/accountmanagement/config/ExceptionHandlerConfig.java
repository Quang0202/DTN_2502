package vti.accountmanagement.config;

import jakarta.validation.ConstraintViolationException;
import org.springframework.data.mapping.PropertyReferenceException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

import vti.accountmanagement.exception.CustomException;
import vti.accountmanagement.payload.Response;

@RestControllerAdvice
public class ExceptionHandlerConfig {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Response<Map<String, String>> handleInvalidArgument(MethodArgumentNotValidException ex) {
        Map<String, String> errorMap = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error -> {
            errorMap.put(error.getField(), error.getDefaultMessage());
        });

        return new Response<>(HttpStatus.BAD_REQUEST.toString(), errorMap);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ConstraintViolationException.class)
    public Response<Map<String, String>> handleInvalidArgument(ConstraintViolationException ex) {
        Map<String, String> errorMap = new HashMap<>();
        ex.getConstraintViolations().forEach(error -> {
            String field = error.getPropertyPath().toString();
            if (field.contains(".")) {
                field = field.substring(field.lastIndexOf(".")).replaceAll("\\.","");
            }
            errorMap.put(field, error.getMessageTemplate());
        });

        return new Response<>(HttpStatus.BAD_REQUEST.toString(), errorMap);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(PropertyReferenceException.class)
    public Response<String> handleInvalidArgument(PropertyReferenceException ex) {
        return new Response<>(HttpStatus.BAD_REQUEST.toString(), ex.getMessage());
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(CustomException.class)
    public Response<String> handleInvalidArgument(CustomException ex) {
        return new Response<>(HttpStatus.BAD_REQUEST.toString(), ex.getMessage());
    }
}
