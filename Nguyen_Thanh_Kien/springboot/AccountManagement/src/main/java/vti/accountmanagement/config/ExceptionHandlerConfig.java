package vti.accountmanagement.config;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.ConstraintViolationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mapping.PropertyReferenceException;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;

import java.util.List;

import org.springframework.web.servlet.NoHandlerFoundException;
import vti.accountmanagement.exception.CustomException;
import vti.accountmanagement.exception.DuplicateException;
import vti.accountmanagement.payload.ApiError;
import vti.accountmanagement.payload.ApiSubError;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.AuthenticationException;

@Slf4j
@RestControllerAdvice
public class ExceptionHandlerConfig {

//    exception handle validate @RequestBody
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiError>  handleInvalidArgument(MethodArgumentNotValidException ex, HttpServletRequest request) {
        List<ApiSubError> errors = ex.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(error -> new ApiSubError(error.getField(), error.getDefaultMessage()))
                .toList();

        ApiError response = new ApiError(
                HttpStatus.BAD_REQUEST.value(),
                "Validation failed",
                request.getRequestURI(),
                errors
        );
        log.error("Custom exception: {}", ex.getMessage(), ex);
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

//    xử lý exception @RequestParam, @PathVariable
    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<ApiError> handleInvalidArgument(ConstraintViolationException ex, HttpServletRequest request) {
        List<ApiSubError> errors = ex.getConstraintViolations().stream()
                .map(violation -> {
                    String field = violation.getPropertyPath().toString();
                    String message = violation.getMessage();
                    return new ApiSubError(field, message);
                })
                .toList();
        ApiError res = new ApiError(
                HttpStatus.BAD_REQUEST.value(),
                "Validation failed",
                request.getRequestURI(),
                errors
        );
        log.error("Custom exception: {}", ex.getMessage(), ex);
        return new ResponseEntity<>(res, HttpStatus.BAD_REQUEST);
    }

//    handle property name
    @ExceptionHandler(PropertyReferenceException.class)
    public ResponseEntity<ApiError> handleInvalidArgument(PropertyReferenceException ex, HttpServletRequest request) {
        ApiError error = new ApiError(
                HttpStatus.BAD_REQUEST.value(),
                ex.getMessage(),
                request.getRequestURI()
        );
        log.error("Custom exception: {}", ex.getMessage(), ex);
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

//    exception custom handle
    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ApiError> handleInvalidArgument(CustomException ex, HttpServletRequest request) {
        ApiError error = new ApiError(
                HttpStatus.BAD_REQUEST.value(),
                ex.getMessage(),
                request.getRequestURI()
        );
        log.error("Custom exception: {}", ex.getMessage(), ex);
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

//    exception duplicate data
    @ExceptionHandler(DuplicateException.class)
    public ResponseEntity<ApiError> handleInvalidArgument(DuplicateException ex, HttpServletRequest request) {
        ApiError error = new ApiError(
                HttpStatus.CONFLICT.value(),
                ex.getMessage(),
                request.getRequestURI()
        );
        log.error("Custom exception: {}", ex.getMessage(), ex);
        return new ResponseEntity<>(error, HttpStatus.CONFLICT);
    }

//    check body null response 400 thay vì 401
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<ApiError> handleBadRequest(HttpMessageNotReadableException ex, HttpServletRequest request) {
        ApiError error = new ApiError(
                HttpStatus.BAD_REQUEST.value(),
                "Invalid or empty request body",
                request.getRequestURI()
        );
        log.error("Custom exception: {}", ex.getMessage(), ex);
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

//   xử lý url không tồn tại thì báo 404 thay vì 401
    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<ApiError> handleNotFound(NoHandlerFoundException ex, HttpServletRequest request) {

        ApiError error = new ApiError(
                HttpStatus.NOT_FOUND.value(),
                "Not Found",
                request.getRequestURI()
        );
        log.error("Custom exception: {}", ex.getMessage(), ex);
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiError> handleAll(Exception ex, HttpServletRequest request) {
//        khong check doi voi 401 va 403
        if (ex instanceof AccessDeniedException || ex instanceof AuthenticationException) {
            throw (RuntimeException) ex;
        }
        ApiError error = new ApiError(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                ex.getMessage(),
                request.getRequestURI()
        );
        log.error("Custom exception: {}", ex.getMessage(), ex);
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }

//    handle exception sai ten dang nhap hoac mat khau
    @ExceptionHandler(BadCredentialsException.class)
    public ResponseEntity<ApiError> handleBadCredentials(BadCredentialsException ex, HttpServletRequest request) {
        ApiError apiError = new ApiError(
                HttpStatus.UNAUTHORIZED.value(),
                "Invalid username or password.",
                request.getRequestURI()
        );
        log.error("Custom exception: {}", ex.getMessage(), ex);
        return new ResponseEntity<>(apiError, HttpStatus.UNAUTHORIZED);
    }
}
