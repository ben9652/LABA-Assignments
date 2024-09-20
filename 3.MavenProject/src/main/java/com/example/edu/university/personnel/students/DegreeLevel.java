package com.example.edu.university.personnel.students;

public enum DegreeLevel {
    BACHELOR(4), MASTER(2), PHD(5);

    private int durationYears;

    DegreeLevel(int durationYears) {
        this.durationYears = durationYears;
    }

    public int getDurationYears() {
        return durationYears;
    }

    public int calculateGraduationYear(int startYear) {
        return startYear + durationYears;
    }

    @Override
    public String toString() {
        return name() + " (" + durationYears + " years)";
    }
}
