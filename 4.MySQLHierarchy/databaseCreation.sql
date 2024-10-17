DROP DATABASE EducationalInstitution;
CREATE DATABASE EducationalInstitution;

USE EducationalInstitution;

DROP TABLE IF EXISTS Students;
CREATE TABLE Students (
    id_student          INT             AUTO_INCREMENT,
    id_department       INT             NOT NULL,
    first_name          VARCHAR(50)     NOT NULL,
    last_name           VARCHAR(50)     NOT NULL,
    enrollment_date     DATE            NOT NULL,
    gpa                 DECIMAL(3, 2)   NULL,
    CONSTRAINT pk_student PRIMARY KEY(id_student)
)ENGINE=INNODB;

DROP TABLE IF EXISTS Professors;
CREATE TABLE Professors (
    id_professor        INT             AUTO_INCREMENT,
    id_department       INT             NULL,
    first_name          VARCHAR(50)     NOT NULL,
    last_name           VARCHAR(50)     NOT NULL,
    hire_date           DATE            NOT NULL,
    salary              DECIMAL(10, 2)  NOT NULL,
    CONSTRAINT pk_professor PRIMARY KEY(id_professor)
)ENGINE=INNODB;

DROP TABLE IF EXISTS Courses;
CREATE TABLE Courses (
    id_course           INT             AUTO_INCREMENT,
    id_department       INT             NOT NULL,
    id_professor        INT             NOT NULL,
    course_name         VARCHAR(100)    NOT NULL,
    credits             INT             NOT NULL,
    CONSTRAINT pk_course PRIMARY KEY(id_course)
)ENGINE=INNODB;

DROP TABLE IF EXISTS Departments;
CREATE TABLE Departments (
    id_department       INT             AUTO_INCREMENT,
    id_head_professor   INT             NOT NULL,
    department_name     VARCHAR(100)    NOT NULL,
    CONSTRAINT pk_department PRIMARY KEY(id_department)
)ENGINE=INNODB;

DROP TABLE IF EXISTS Enrollments;
CREATE TABLE Enrollments (
    id_enrollment       INT             AUTO_INCREMENT,
    id_student          INT             NOT NULL,
    id_course           INT             NOT NULL,
    enrollment_date     DATE            NOT NULL,
    grade               DECIMAL(4, 2)   NULL,
    CONSTRAINT pk_enrollment PRIMARY KEY(id_enrollment)
)ENGINE=INNODB;

DROP TABLE IF EXISTS Classrooms;
CREATE TABLE Classrooms (
    id_classroom        INT             AUTO_INCREMENT,
    room_number         VARCHAR(20)     NOT NULL,
    building            VARCHAR(100)    NOT NULL,
    capacity            INT             NOT NULL,
    CONSTRAINT pk_classrooms PRIMARY KEY(id_classroom)
)ENGINE=INNODB;

DROP TABLE IF EXISTS CoursesSchedules;
CREATE TABLE CoursesSchedules (
    id_schedule         INT             AUTO_INCREMENT,
    id_course           INT             NOT NULL,
    id_classroom        INT             NOT NULL,
    day_of_week         VARCHAR(20)     NOT NULL,
    start_time          TIME            NOT NULL,
    end_time            TIME            NOT NULL,
    CONSTRAINT pk_course_schedule PRIMARY KEY(id_schedule, id_course)
)ENGINE=INNODB;

DROP TABLE IF EXISTS Exams;
CREATE TABLE Exams (
    id_exam             INT             AUTO_INCREMENT,
    id_course           INT             NOT NULL,
    exam_date           DATE            NOT NULL,
    exam_type           VARCHAR(50)     NULL,
    total_marks         INT             NOT NULL,
    CONSTRAINT pk_exam PRIMARY KEY(id_exam, id_course)
)ENGINE=INNODB;

DROP TABLE IF EXISTS StudentsExams;
CREATE TABLE StudentsExams (
    id_student_exam     INT             AUTO_INCREMENT,
    id_student          INT             NOT NULL,
    id_exam             INT             NOT NULL,
    id_course           INT             NOT NULL,
    marks_obtained      DECIMAL(5, 2)   NULL,
    CONSTRAINT pk_student_exams PRIMARY KEY(id_student_exam, id_student, id_exam, id_course)
)ENGINE=INNODB;

DROP TABLE IF EXISTS ResearchProjects;
CREATE TABLE ResearchProjects (
    id_project          INT             AUTO_INCREMENT,
    id_professor        INT             NOT NULL,
    project_title       VARCHAR(200)    NOT NULL,
    start_date          DATE            NOT NULL,
    end_date            DATE            NULL,
    CONSTRAINT pk_research_project PRIMARY KEY(id_project, id_professor)
)ENGINE=INNODB;

DROP TABLE IF EXISTS DepartmentsBudgets;
CREATE TABLE DepartmentsBudgets (
    id_budget           INT             AUTO_INCREMENT,
    id_department       INT             NOT NULL,
    fiscal_year         YEAR            NOT NULL,
    allocated_budget    DECIMAL(12, 2)  NOT NULL,
    CONSTRAINT pk_departments_budgets PRIMARY KEY(id_budget, id_department)
)ENGINE=INNODB;

DROP TABLE IF EXISTS Clubs;
CREATE TABLE Clubs (
    id_club             INT             AUTO_INCREMENT,
    id_president        INT             NOT NULL,
    club_name           VARCHAR(100)    NOT NULL,
    creation_date       DATE            NOT NULL,
    description         VARCHAR(200)    NOT NULL,
    CONSTRAINT pk_club PRIMARY KEY(id_club)
)ENGINE=INNODB;

ALTER TABLE Students
ADD CONSTRAINT fk_student_department
FOREIGN KEY (id_department)
REFERENCES Departments(id_department);

ALTER TABLE Professors
ADD CONSTRAINT fk_professor_department
FOREIGN KEY (id_department)
REFERENCES Departments(id_department);

ALTER TABLE Courses
ADD CONSTRAINT fk_course_department
FOREIGN KEY (id_department)
REFERENCES Departments(id_department);

ALTER TABLE Courses
ADD CONSTRAINT fk_course_professor
FOREIGN KEY (id_professor)
REFERENCES Professors(id_professor);

ALTER TABLE Departments
ADD CONSTRAINT fk_department_head
FOREIGN KEY (id_head_professor)
REFERENCES Professors(id_professor);

ALTER TABLE Enrollments
ADD CONSTRAINT fk_enrollment_student
FOREIGN KEY (id_student)
REFERENCES Students(id_student);

ALTER TABLE Enrollments
ADD CONSTRAINT fk_enrollment_course
FOREIGN KEY (id_course)
REFERENCES Courses(id_course);

ALTER TABLE CoursesSchedules
ADD CONSTRAINT fk_schedule_course
FOREIGN KEY (id_course)
REFERENCES Courses(id_course);

ALTER TABLE CoursesSchedules
ADD CONSTRAINT fk_schedule_classroom
FOREIGN KEY (id_classroom)
REFERENCES Classrooms(id_classroom);

ALTER TABLE Exams
ADD CONSTRAINT fk_exam_course
FOREIGN KEY (id_course)
REFERENCES Courses(id_course);

ALTER TABLE StudentsExams
ADD CONSTRAINT fk_student_exam_student
FOREIGN KEY (id_student)
REFERENCES Students(id_student);

ALTER TABLE StudentsExams
ADD CONSTRAINT fk_student_exam_exam
FOREIGN KEY (id_exam)
REFERENCES Exams(id_exam);

ALTER TABLE StudentsExams
ADD CONSTRAINT fk_student_exam_course
FOREIGN KEY (id_course)
REFERENCES Exams(id_course);

ALTER TABLE ResearchProjects
ADD CONSTRAINT fk_project_professor
FOREIGN KEY (id_professor)
REFERENCES Professors(id_professor);

ALTER TABLE DepartmentsBudgets
ADD CONSTRAINT fk_budget_department
FOREIGN KEY (id_department)
REFERENCES Departments(id_department);

ALTER TABLE Clubs
ADD CONSTRAINT fk_club_president
FOREIGN KEY (id_president)
REFERENCES Students(id_student);
