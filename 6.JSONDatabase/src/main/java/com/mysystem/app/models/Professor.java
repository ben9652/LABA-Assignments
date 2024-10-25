package com.mysystem.app.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Date;
import java.time.format.DateTimeFormatter;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Professor {

    @JsonProperty("professor_id")
    private int id;

    @JsonProperty("department_id")
    private Integer idDepartment;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("hire_date")
    private Date hireDate;

    @JsonProperty("salary")
    private float salary;

    @JsonBackReference
    private Department department;

    public Professor() {}

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
