package com.example.edu.university.personnel.students;
import java.util.ArrayList;
import java.util.List;

import com.example.edu.university.Course;
import com.example.edu.university.personnel.Gender;
import com.example.edu.university.personnel.Person;
import com.example.exceptions.InvalidAgeException;

public class Student extends Person {
    protected int studentId;
    protected String major;
    protected List<Course> coursesEnrolled;
    protected List<Integer> grades;

    protected double averageGrade;
    
    public Student(String name, short age, Gender gender, int studentId, String major) throws InvalidAgeException {
        super(name, age, gender);
        this.studentId = studentId;
        this.major = major;
        coursesEnrolled = new ArrayList<Course>();
        averageGrade = 0;
    }

    public void enrollInCourse(Course course) {
        coursesEnrolled.add(course);
    }

    public List<Course> getCoursesEnrolled() {
        return coursesEnrolled;
    }

    public int getId() {
        return studentId;
    }

    public String getMajor() {
        return major;
    }

    public double getGrade() {
        return averageGrade;
    }

    public void setGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void calcAvgGrade() {
        averageGrade = grades.stream()
                    .mapToInt(grade -> grade)
                    .average()
                    .orElse(0.0)
                    ;
    }

    @Override
    public String toString() {
        return "Student " + studentId + ": " + super.name;
    }

    @Override
    public void performDuties() {
        System.out.println("Attend classes, complete assignments, and study for exams.");
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + studentId;
        result = prime * result + ((major == null) ? 0 : major.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (studentId != other.studentId)
            return false;
        if (major == null) {
            if (other.major != null)
                return false;
        }
        else if (!major.equals(other.major))
            return false;
        return true;
    }
}
