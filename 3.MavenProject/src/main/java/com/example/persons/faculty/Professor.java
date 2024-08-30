package com.example.persons.faculty;

import com.example.exceptions.InvalidAgeException;
import com.example.interfaces.Manageable;
import com.example.interfaces.Researchable;
import com.example.interfaces.Teachable;
import com.example.persons.Gender;

public final class Professor extends Faculty implements Teachable, Researchable, Manageable {
    private boolean tenure;

    public Professor(String name, short age, Gender gender, int facultyId, boolean tenure) throws InvalidAgeException {
        super(name, age, gender, facultyId);
        this.tenure = tenure;
    }

    public boolean isTenure() {
        return tenure;
    }

    public void setTenure(boolean tenure) {
        this.tenure = tenure;
    }

    @Override
    public String toString() {
        return
            "Professor " + facultyId + ": " + name +
            "; " +
            (super.gender == Gender.MALE ? "he" : "she") + " " +
            (tenure ? "has" : "has no") + " tenure"
        ;
    }

    @Override
    public void manage() {
        System.out.println("Managing research projects and academic programs.");
    }

    @Override
    public void conductResearch() {
        System.out.println("Conducting research in specialized fields.");
    }

    @Override
    public void teach() {
        System.out.println("Teaching advanced courses.");
    }
}
