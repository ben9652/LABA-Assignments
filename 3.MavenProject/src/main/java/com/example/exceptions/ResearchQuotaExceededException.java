package com.example.exceptions;

public class ResearchQuotaExceededException extends Exception {
    public ResearchQuotaExceededException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
