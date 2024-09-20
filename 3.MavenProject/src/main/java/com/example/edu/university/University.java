package com.example.edu.university;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.example.edu.university.personnel.faculty.Professor;

public class University {
    private String universityName;

    private List<Department> departments;

    private List<Professor> professors;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
    }

    public List<Professor> getExperiencedProfessors(int years) {
        return professors.stream()
                .filter(professor -> professor.getYearsOfExperience() > years)
                .collect(Collectors.toList())
                ;
    }

    public List<String> getUpperCaseDepartmentNames() {
        return departments.stream()
                .map(department -> department.getDepartmentName().toUpperCase())
                .collect(Collectors.toList())
                ;
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
