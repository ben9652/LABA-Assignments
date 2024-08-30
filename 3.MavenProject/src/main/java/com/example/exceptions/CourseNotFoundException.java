package com.example.exceptions;

public class CourseNotFoundException extends Exception {
    public CourseNotFoundException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
