package com.mysystem.app.models;

import java.sql.Date;
import java.time.format.DateTimeFormatter;

public class Professor {
    private int id;
    private Integer idDepartment;
    private String firstName;
    private String lastName;
    private Date hireDate;
    private float salary;

    public Professor(int id, String firstName, String lastName, Date hireDate, float salary) {
        this.id = id;
        this.idDepartment = null;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public Professor(int id, Integer isDepartment, String firstName, String lastName, Date hireDate, float salary) {
        this.id = id;
        this.idDepartment = isDepartment;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public Professor(String firstName, String lastName, Date hireDate, float salary) {
        this.id = -1;
        this.idDepartment = null;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public Professor(Integer isDepartment, String firstName, String lastName, Date hireDate, float salary) {
        this.id = -1;
        this.idDepartment = isDepartment;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hireDate = hireDate;
        this.salary = salary;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Integer getIdDepartment() {
        return idDepartment;
    }
    public void setIdDepartment(Integer idDepartment) {
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

    public Date getHireDate() {
        return hireDate;
    }
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Professor" +
            "\n\tID: " + id +
            "\n\tDepartment ID: " + idDepartment +
            "\n\tFirst name: " + firstName +
            "\n\tLast name: " + lastName +
            "\n\tHire date: " + hireDate.toLocalDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
            "\n\tSalary: " + salary;
    }
}
