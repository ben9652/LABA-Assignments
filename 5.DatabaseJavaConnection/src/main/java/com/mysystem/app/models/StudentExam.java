package com.mysystem.app.models;

public class StudentExam {
    private int id;
    private int idStudent;
    private int idExam;
    private int idCourse;
    private float marksObtained;
    
    public StudentExam(int id, int idStudent, int idExam, int idCourse, float marksObtained) {
        this.id = id;
        this.idStudent = idStudent;
        this.idExam = idExam;
        this.idCourse = idCourse;
        this.marksObtained = marksObtained;
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
    
    public int getIdExam() {
        return idExam;
    }
    public void setIdExam(int idExam) {
        this.idExam = idExam;
    }
    
    public int getIdCourse() {
        return idCourse;
    }
    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }
    
    public float getMarksObtained() {
        return marksObtained;
    }
    public void setMarksObtained(float marksObtained) {
        this.marksObtained = marksObtained;
    }
}
