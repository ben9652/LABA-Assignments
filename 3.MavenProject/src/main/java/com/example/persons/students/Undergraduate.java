package com.example.persons.students;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.example.exceptions.CourseNotFoundException;
import com.example.exceptions.InvalidAgeException;
import com.example.interfaces.Learnable;
import com.example.persons.Gender;

public final class Undergraduate extends Student implements Learnable {
    private short year;

    private static ArrayList<String> availableCourses = new ArrayList<>();

    static {
        loadCourses(".\\src\\main\\files\\courses.txt");
    }

    public Undergraduate(String name, short age, Gender gender, int studentId, String major, short year) throws InvalidAgeException {
        super(name, age, gender, studentId, major);
        this.year = year;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    private boolean isValidCourse(String courseName) {
        return availableCourses.contains(courseName);
    }

    private static void loadCourses(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String courseName;
            while((courseName = br.readLine()) != null) {
                availableCourses.add(courseName);
            }
        }
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    @Override
    public String toString() {
        return
            "Undergraduate " +
            studentId + ": " +
            name + "; " +
            (super.gender == Gender.MALE ? "he's in year" : "she's in year ") +
            year +
            " of college"
        ;
    }

    @Override
    public void learn() {
        System.out.println("Learning from courses and textbooks.");
    }

    @Override
    public void enrollInCourse(String courseName) throws CourseNotFoundException {
        if(!isValidCourse(courseName))
            throw new CourseNotFoundException(courseName);
        
        System.out.println("Enrolled in course: " + courseName);
    }
}
