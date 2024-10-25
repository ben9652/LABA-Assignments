package com.mysystem.app.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Exam {

    @JsonProperty("exam_id")
    private int id;

    @JsonProperty("course_id")
    private int idCourse;

    @JsonProperty("exam_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date examDate;

    @JsonProperty("exam_type")
    private String examType;

    @JsonProperty("total_marks")
    private int totalMarks;

    public Exam(@JsonProperty("exam_id") int id, 
                @JsonProperty("course_id") int idCourse, 
                @JsonProperty("exam_date") Date examDate, 
                @JsonProperty("exam_type") String examType, 
                @JsonProperty("total_marks") int totalMarks) {
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
