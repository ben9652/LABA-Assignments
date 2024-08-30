package com.example.edu.university.personnel.faculty;

import com.example.edu.university.personnel.Gender;
import com.example.exceptions.InvalidAgeException;

public final class AdjunctProfessor extends Faculty {
    private int contractLength;

    public AdjunctProfessor(String name, short age, Gender gender, int facultyId, int contractLength) throws InvalidAgeException {
        super(name, age, gender, facultyId);
        this.contractLength = contractLength;
    }

    public int getContractLength() {
        return contractLength;
    }

    public void setContractLength(int contractLength) {
        this.contractLength = contractLength;
    }

    @Override
    public String toString() {
        return
            "Adjunct professor " + facultyId + ": " + name +
            "; " +
            (super.gender == Gender.MALE ? "his " : "her ") + "contract last " +
            contractLength + "months"
        ;
    }
}
