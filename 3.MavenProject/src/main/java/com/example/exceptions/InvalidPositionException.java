package com.example.exceptions;

public class InvalidPositionException extends Exception {
    public InvalidPositionException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
