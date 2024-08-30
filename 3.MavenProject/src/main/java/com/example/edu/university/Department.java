package com.example.edu.university;

import java.util.ArrayList;
import java.util.List;

import com.example.edu.university.personnel.faculty.Faculty;

public class Department {
    private String departmentName;

    private List<Faculty> facultyMembers;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.facultyMembers = new ArrayList<>();
    }

    public void addFacultyMember(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    public List<Faculty> getFacultyMembers() {
        return facultyMembers;
    }
    
    public String getDepartmentName() {
        return departmentName;
    }
}
