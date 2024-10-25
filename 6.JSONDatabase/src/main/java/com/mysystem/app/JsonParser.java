package com.mysystem.app;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mysystem.app.models.*;

import java.io.File;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class JsonParser {
    private static final Logger logger = LogManager.getLogger(JsonParser.class);

    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            UniversityData universityData = mapper.readValue(new File("files/university_data.json"), UniversityData.class);

            System.out.println("Lista de estudiantes:");
            for (Student student : universityData.getStudents()) {
                System.out.println(student.getFirstName() + " " + student.getLastName());
            }

            System.out.println("\nLista de profesores:");
            for (Professor professor : universityData.getProfessors()) {
                System.out.println(professor.getFirstName() + " " + professor.getLastName());
            }

            System.out.println("\nLista de departamentos:");
            for (Department department : universityData.getDepartments()) {
                System.out.println(department.getDepartmentName());
            }

            System.out.println("\nLista de cursos:");
            for (Course course : universityData.getCourses()) {
                System.out.println(course.getCourseName());
            }

            System.out.println("\nLista de exámenes:");
            for (Exam exam : universityData.getExams()) {
                System.out.println("Examen: " + exam.getExamType() + " para el curso " + exam.getIdCourse());
            }

        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }

    public static class UniversityData {
        private List<Student> students;
        private List<Professor> professors;
        private List<Department> departments;
        private List<Course> courses;
        private List<Exam> exams;

        public UniversityData() {
        }

        public List<Student> getStudents() {
            return students;
        }

        public void setStudents(List<Student> students) {
            this.students = students;
        }

        public List<Professor> getProfessors() {
            return professors;
        }

        public void setProfessors(List<Professor> professors) {
            this.professors = professors;
        }

        public List<Department> getDepartments() {
            return departments;
        }

        public void setDepartments(List<Department> departments) {
            this.departments = departments;
        }

        public List<Course> getCourses() {
            return courses;
        }

        public void setCourses(List<Course> courses) {
            this.courses = courses;
        }

        public List<Exam> getExams() {
            return exams;
        }

        public void setExams(List<Exam> exams) {
            this.exams = exams;
        }
    }
}
