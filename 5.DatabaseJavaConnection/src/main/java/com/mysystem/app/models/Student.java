package com.mysystem.app.models;

import java.sql.Date;

public class Student {
    private int id;
    private int idDepartment;
    private String firstName;
    private String lastName;
    private Date enrollmentDate;
    private Float gpa;

    public Student(int id, int idDepartment, String firstName, String lastName, Date enrollmentDate, Float gpa) {
        this.id = id;
        this.idDepartment = idDepartment;
        this.firstName = firstName;
        this.lastName = lastName;
        this.enrollmentDate = enrollmentDate;
        this.gpa = gpa;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public int getIdDepartment() {
        return idDepartment;
    }
    public void setIdDepartment(int idDepartment) {
        this.idDepartment = idDepartment;
    }
    
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public Date getEnrollmentDate() {
        return enrollmentDate;
    }
    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }
    
    public Float getGpa() {
        return gpa;
    }
    public void setGpa(Float gpa) {
        this.gpa = gpa;
    }
}
