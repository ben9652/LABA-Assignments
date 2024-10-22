package com.mysystem.app.models;

import java.util.List;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "department")
@XmlType(propOrder = { "id", "idHeadProfessor", "departmentName", "professors", "students" })
public class Department {

    private int id;
    private int idHeadProfessor;
    private String departmentName;

    private List<Professor> professors;
    private List<Student> students;

    public Department() {}

    public Department(int id, int idHeadProfessor, String departmentName) {
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

    @XmlElement
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement(name = "head_professor_id")
    public int getIdHeadProfessor() {
        return idHeadProfessor;
    }

    public void setIdHeadProfessor(int idHeadProfessor) {
        this.idHeadProfessor = idHeadProfessor;
    }

    @XmlElement(name = "department_name")
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    // Anotación para listas
    @XmlElementWrapper(name = "professors")
    @XmlElement(name = "professor")
    public List<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(List<Professor> professors) {
        this.professors = professors;
    }

    @XmlElementWrapper(name = "students")
    @XmlElement(name = "student")
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
