package com.example.persons.staff;

import com.example.exceptions.InvalidAgeException;
import com.example.exceptions.InvalidPositionException;
import com.example.persons.Gender;

public final class AdministrativeStaff extends Staff {
    private String officeNumber;

    public AdministrativeStaff(String name, short age, Gender gender, int staffId, String position, String officeNumber) throws InvalidAgeException, InvalidPositionException {
        super(name, age, gender, staffId, position);
        this.officeNumber = officeNumber;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    @Override
    public String toString() {
        return
            "Administrative staff " + staffId + ": " + name +
            "; " +
            (super.gender == Gender.MALE ? "his office is " : "her office is ") +
            officeNumber
        ;
    }
}
