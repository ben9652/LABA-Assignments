package com.example.edu.university;

public enum CourseType {
    MANDATORY(6), ELECTIVE(3);

    private int credits;

    CourseType(int credits) {
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }

    static {
        for(CourseType type : CourseType.values()) {
            if(type.credits <= 0) {
                throw new IllegalArgumentException("Credits must be positive");
            }
        }
    }

    @Override
    public String toString() {
        return name() + " (Credits: " + credits + ")";
    }
}
