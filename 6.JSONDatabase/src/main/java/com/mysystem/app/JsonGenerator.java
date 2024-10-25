package com.mysystem.app;

import java.util.Arrays;
import java.util.List;
import java.sql.Date;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.mysystem.app.models.Course;
import com.mysystem.app.models.Department;
import com.mysystem.app.models.Exam;
import com.mysystem.app.models.Professor;
import com.mysystem.app.models.Student;

public class JsonGenerator {
    private static final Logger logger = LogManager.getLogger(JsonGenerator.class);

    public static void main(String[] args) {
        try {
            Course course1 = new Course(101, 1, 10, "Mathematics", 5);
            Course course2 = new Course(102, 1, 11, "Physics", 4);

            Student student1 = new Student(1, 1, "Lucas", "Gomez", new Date(0), Arrays.asList(course1, course2));
            Student student2 = new Student(2, 1, "Maria", "Lopez", new Date(0), Arrays.asList(course2));

            Professor professor1 = new Professor(10, "John", "Doe", new Date(0), 5000.50f);
            Professor professor2 = new Professor(11, "Emily", "Smith", new Date(0), 4800.00f);

            Department department = new Department(1, 10, "Computer Science", Arrays.asList(professor1, professor2), Arrays.asList(student1, student2));

            Exam exam1 = new Exam(1001, 101, new Date(0), "Final", 100);
            Exam exam2 = new Exam(1002, 102, new Date(0), "Midterm", 50);

            List<Student> students = Arrays.asList(student1, student2);
            List<Professor> professors = Arrays.asList(professor1, professor2);
            List<Department> departments = Arrays.asList(department);
            List<Course> courses = Arrays.asList(course1, course2);
            List<Exam> exams = Arrays.asList(exam1, exam2);

            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);

            mapper.writeValue(new File("files/university_data.json"), new UniversityData(students, professors, departments, courses, exams));

            System.out.println("Archivo JSON generado exitosamente.");

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

        public UniversityData(List<Student> students, List<Professor> professors, List<Department> departments, List<Course> courses, List<Exam> exams) {
            this.students = students;
            this.professors = professors;
            this.departments = departments;
            this.courses = courses;
            this.exams = exams;
        }

        public List<Student> getStudents() {
            return students;
        }

        public List<Professor> getProfessors() {
            return professors;
        }

        public List<Department> getDepartments() {
            return departments;
        }

        public List<Course> getCourses() {
            return courses;
        }

        public List<Exam> getExams() {
            return exams;
        }
    }
}
