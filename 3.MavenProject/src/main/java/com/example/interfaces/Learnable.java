package com.example.interfaces;

import com.example.exceptions.CourseNotFoundException;

public interface Learnable {
    void learn();
    void enrollInCourse(String courseName) throws CourseNotFoundException;
}
