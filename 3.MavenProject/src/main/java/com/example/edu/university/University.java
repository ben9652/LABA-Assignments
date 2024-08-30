package com.example.edu.university;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String universityName;

    private List<Department> departments;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public List<Department> getDepartments() {
        return departments;
    }
    
    public String getUniversityName() {
        return universityName;
    }
}
