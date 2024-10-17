package com.mysystem.app.models;

import java.sql.Date;

public class Enrollment {
    private int id;
    private int idStudent;
    private int idCourse;
    private Date enrollmentDate;
    private Float grade;

    public Enrollment(int id, int idStudent, int idCourse, Date enrollmentDate, Float grade) {
        this.id = id;
        this.idStudent = idStudent;
        this.idCourse = idCourse;
        this.enrollmentDate = enrollmentDate;
        this.grade = grade;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public int getIdStudent() {
        return idStudent;
    }
    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }
    
    public int getIdCourse() {
        return idCourse;
    }
    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }
    
    public Date getEnrollmentDate() {
        return enrollmentDate;
    }
    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }
    
    public Float getGrade() {
        return grade;
    }
    public void setGrade(Float grade) {
        this.grade = grade;
    }
}
