package com.example.exceptions;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
