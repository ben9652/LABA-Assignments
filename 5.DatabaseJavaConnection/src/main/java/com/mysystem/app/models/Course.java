package com.mysystem.app.models;

public class Course {
    private int id;
    private int idDepartment;
    private int idProfessor;
    private String courseName;
    private int credits;

    public Course(int id, int idDepartment, int idProfessor, String courseName, int credits) {
        this.id = id;
        this.idDepartment = idDepartment;
        this.idProfessor = idProfessor;
        this.courseName = courseName;
        this.credits = credits;
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
    
    public int getIdProfessor() {
        return idProfessor;
    }
    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }
    
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    public int getCredits() {
        return credits;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }
}
