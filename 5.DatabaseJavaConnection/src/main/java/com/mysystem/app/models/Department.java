package com.mysystem.app.models;

public class Department {
    private int id;
    private int idHeadProfessor;
    private String departmentName;

    public Department(int id, int idHeadProfessor, String departmentName) {
        this.id = id;
        this.idHeadProfessor = idHeadProfessor;
        this.departmentName = departmentName;
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
}
