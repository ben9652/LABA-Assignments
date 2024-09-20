package com.example.edu;

public enum Weekday {
    MONDAY("Start of the week"),
    TUESDAY("Second day"),
    WEDNESDAY("Midweek"),
    THURSDAY("Almost there"),
    FRIDAY("End of the work week"),
    SATURDAY("Weekend"),
    SUNDAY("Day of rest");

    private String description;
    
    Weekday(String description) {
        this.description = description;
    }    

    public String getDescription() {
        return description;
    }

    public boolean isWorkday() {
        return this != SATURDAY && this != SUNDAY;
    }

    @Override
    public String toString() {
        return name() + ": " + description;
    }
}
