package com.example.edu.university;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.example.edu.university.personnel.faculty.Faculty;
import com.example.edu.university.personnel.students.Student;

public class Course {
    private String courseName;

    private Faculty instructor;

    private List<Student> enrolledStudents;

    public Course(String courseName, Faculty instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.enrolledStudents = new ArrayList<>();
    }

    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    public List<Student> getTopStudents(double threshold) {
        return enrolledStudents.stream()
                .filter(student -> student.getGrade() > threshold)
                .collect(Collectors.toList())
                ;
    }

    public List<Student> getSortedStudents() {
        return enrolledStudents.stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList())
                ;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
    
    public String getCourseName() {
        return courseName;
    }
    
    public Faculty getInstructor() {
        return instructor;
    }
}
