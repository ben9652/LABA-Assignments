package com.example.exceptions;

public class InsufficientPermissionsException extends Exception {
    public InsufficientPermissionsException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
