package com.example.edu.university.personnel.students;

public enum GradeType {
    A(90, 100), B(80, 89), C(70, 79), D(60, 69), F(0, 59);

    private int minScore;
    private int maxScore;

    GradeType(int minScore, int maxScore) {
        this.minScore = minScore;
        this.maxScore = maxScore;
    }

    public boolean isPassing() {
        return this != F;
    }

    public boolean includesScore(int score) {
        return score >= minScore && score <= maxScore;
    }

    @Override
    public String toString() {
        return name() + " (" + minScore + "-" + maxScore + ")";
    }
}
