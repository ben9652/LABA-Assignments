package com.example.edu.university.personnel.faculty;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.example.edu.university.Course;
import com.example.edu.university.personnel.Gender;
import com.example.edu.university.personnel.Person;
import com.example.exceptions.InvalidAgeException;

public class Faculty extends Person {
    protected int facultyId;
    private List<Course> coursesTaught;

    public Faculty(String name, short age, Gender gender, int facultyId) throws InvalidAgeException {
        super(name, age, gender);
        this.facultyId = facultyId;
        coursesTaught = new ArrayList<Course>();
    }

    public void addCourse(Course course) {
        coursesTaught.add(course);
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public long getNumberOfCoursesTaught() {
        return coursesTaught.stream()
                .count()
                ;
    }

    @Override
    public String toString() {
        return "Faculty " + facultyId + ": " + name;
    }

    @Override
    public void performDuties() {
        System.out.println("Teach classes, develop curriculum, and participate in academic research.");
    }

    public List<String> getCoursesNamesTaught() {
        return coursesTaught.stream()
                .map(Course::getCourseName)
                .collect(Collectors.toList())
                ;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + facultyId;
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
        Faculty other = (Faculty) obj;
        if (facultyId != other.facultyId)
            return false;
        return true;
    }
}
