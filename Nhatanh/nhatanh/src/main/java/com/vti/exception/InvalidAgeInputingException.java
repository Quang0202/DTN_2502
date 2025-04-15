package com.vti.exception;

public class InvalidAgeInputingException extends Exception{

    private static final Long serialVersionUID = 1L;

    public InvalidAgeInputingException(String message){
        super(message);
    }
}
