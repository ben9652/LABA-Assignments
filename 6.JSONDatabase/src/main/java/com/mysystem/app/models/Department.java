package com.mysystem.app.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Department {

    @JsonProperty("department_id")
    private int id;

    @JsonProperty("head_professor_id") 
    private int idHeadProfessor;

    @JsonProperty("department_name")
    private String departmentName;

    @JsonManagedReference
    private List<Professor> professors;

    @JsonManagedReference
    private List<Student> students;

    public Department() {}

    public Department(@JsonProperty("department_id") int id, 
                      @JsonProperty("head_professor_id") int idHeadProfessor, 
                      @JsonProperty("department_name") String departmentName) {
        this.id = id;
        this.idHeadProfessor = idHeadProfessor;
        this.departmentName = departmentName;
    }

    public Department(int id, int idHeadProfessor, String departmentName, List<Professor> professors, List<Student> students) {
        this.id = id;
        this.idHeadProfessor = idHeadProfessor;
        this.departmentName = departmentName;
        this.professors = professors;
        this.students = students;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdHeadProfessor() {
        return idHeadProfessor;
    }

    public void setIdHeadProfessor(int idHeadProfessor) {
        this.idHeadProfessor = idHeadProfessor;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(List<Professor> professors) {
        this.professors = professors;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Department" +
            "\n\tID: " + id +
            "\n\tHead professor ID: " + idHeadProfessor +
            "\n\tDepartment name: " + departmentName +
            "\n";
    }
}
