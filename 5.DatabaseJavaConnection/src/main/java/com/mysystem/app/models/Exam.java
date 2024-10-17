package com.mysystem.app.models;

import java.util.Date;

public class Exam {
    private int id;
    private int idCourse;
    private Date examDate;
    private String examType;
    private int totalMarks;
    
    public Exam(int id, int idCourse, Date examDate, String examType, int totalMarks) {
        this.id = id;
        this.idCourse = idCourse;
        this.examDate = examDate;
        this.examType = examType;
        this.totalMarks = totalMarks;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public int getIdCourse() {
        return idCourse;
    }
    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }
    
    public Date getExamDate() {
        return examDate;
    }
    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }
    
    public String getExamType() {
        return examType;
    }
    public void setExamType(String examType) {
        this.examType = examType;
    }
    
    public int getTotalMarks() {
        return totalMarks;
    }
    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }
}
