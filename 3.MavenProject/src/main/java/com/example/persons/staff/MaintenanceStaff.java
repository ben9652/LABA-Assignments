package com.example.persons.staff;

import com.example.exceptions.InvalidAgeException;
import com.example.exceptions.InvalidPositionException;
import com.example.persons.Gender;

public final class MaintenanceStaff extends Staff {
    private String shift;

    public MaintenanceStaff(String name, short age, Gender gender, int staffId, String position, String shift) throws InvalidAgeException, InvalidPositionException {
        super(name, age, gender, staffId, position);
        this.shift = shift;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    @Override
    public String toString() {
        return
            "Maintenance staff " + staffId + ": " + name +
            "; " +
            shift + " shift"
        ;
    }
}
