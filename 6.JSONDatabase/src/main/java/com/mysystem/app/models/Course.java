package com.mysystem.app.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Course {

    @JsonProperty("course_id")
    private int id;

    @JsonProperty("department_id")
    private int idDepartment;

    @JsonProperty("professor_id")
    private int idProfessor;

    @JsonProperty("course_name")
    private String courseName;

    @JsonProperty("credits")
    private int credits;

    public Course(@JsonProperty("course_id") int id, 
                  @JsonProperty("department_id") int idDepartment, 
                  @JsonProperty("professor_id") int idProfessor, 
                  @JsonProperty("course_name") String courseName, 
                  @JsonProperty("credits") int credits) {
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
