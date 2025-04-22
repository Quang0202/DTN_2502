package com.programming.nhatanh.lesson7.exception;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Arrays;

public class MyException extends Exception implements Serializable {
    private static final long serialVersionUID = 1L;
    private String  stackTrace;
    private LocalDateTime time;
    private String reason;


    @Override
    public String toString() {
        return "MyException{" +
                "stackTrace=" + stackTrace +
                ", time=" + time +
                ", reason='" + reason + '\'' +
                ", message='" + super.getMessage()+ " }";
    }

    public MyException(String message, String reason, String stackTrace, LocalDateTime time) {
        super(message);
        this.reason = reason;
        this.stackTrace = stackTrace;
        this.time = time;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
