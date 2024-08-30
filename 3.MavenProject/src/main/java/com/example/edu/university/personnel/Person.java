package com.example.edu.university.personnel;

import com.example.exceptions.InvalidAgeException;

public abstract class Person {
    protected String name;
    protected short age;
    protected Gender gender;

    private final String institution = "Tech University";

    private static int totalPeople = 0;

    static {
        System.out.println("Person class is loaded.");
    }

    public Person(String name, short age, Gender gender) throws InvalidAgeException {
        if(age < 0 || age > 120) {
            throw new InvalidAgeException("Age must be between 0 and 120.");
        }
        
        this.name = name;
        this.age = age;
        this.gender = gender;
        totalPeople++;
    }

    public static int getTotalPeople() {
        return totalPeople;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public short getAge() {
        return age;
    }

    public void setAge(short age) throws InvalidAgeException {
        if(age < 0 || age > 120) {
            throw new InvalidAgeException("Age must be between 0 and 120.");
        }
        
        this.age = age;
    }

    public final String getInstitution() {
        return institution;
    }

    public abstract void performDuties();
}
