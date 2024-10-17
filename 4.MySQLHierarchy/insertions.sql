INSERT INTO Professors (id_department, first_name, last_name, hire_date, salary) VALUES
(NULL, 'John', 'Doe', '2020-01-15', 60000.00);
INSERT INTO Professors (id_department, first_name, last_name, hire_date, salary) VALUES
(NULL, 'Jane', 'Smith', '2019-08-23', 55000.00);

INSERT INTO Departments (id_head_professor, department_name) VALUES
(1, 'Computer Science');
INSERT INTO Departments (id_head_professor, department_name) VALUES
(2, 'Mathematics');

INSERT INTO Students (id_department, first_name, last_name, enrollment_date, gpa) VALUES
(1, 'Alice', 'Johnson', '2021-09-01', 3.8);
INSERT INTO Students (id_department, first_name, last_name, enrollment_date, gpa) VALUES
(2, 'Bob', 'Williams', '2021-09-01', 3.5);

INSERT INTO Courses (id_department, id_professor, course_name, credits) VALUES
(1, 1, 'Introduction to Programming', 4);
INSERT INTO Courses (id_department, id_professor, course_name, credits) VALUES
(2, 2, 'Linear Algebra', 3);

INSERT INTO Enrollments (id_student, id_course, enrollment_date, grade) VALUES
(1, 1, '2021-09-01', NULL);
INSERT INTO Enrollments (id_student, id_course, enrollment_date, grade) VALUES
(2, 2, '2021-09-01', NULL);

INSERT INTO Exams (id_course, exam_date, exam_type, total_marks) VALUES
(1, '2022-06-01', 'Final', 100);
INSERT INTO Exams (id_course, exam_date, exam_type, total_marks) VALUES
(2, '2022-06-02', 'Midterm', 50);

INSERT INTO StudentsExams (id_student, id_exam, id_course, marks_obtained) VALUES
(1, 1, 1, 85.50);
INSERT INTO StudentsExams (id_student, id_exam, id_course, marks_obtained) VALUES
(2, 2, 2, 40.00);

INSERT INTO Classrooms (room_number, building, capacity) VALUES
('101A', 'Main Building', 50);
INSERT INTO Classrooms (room_number, building, capacity) VALUES
('202B', 'Science Building', 40);

INSERT INTO CoursesSchedules (id_course, id_classroom, day_of_week, start_time, end_time) VALUES
(1, 1, 'Monday', '08:00:00', '10:00:00');
INSERT INTO CoursesSchedules (id_course, id_classroom, day_of_week, start_time, end_time) VALUES
(2, 2, 'Wednesday', '10:00:00', '12:00:00');

INSERT INTO ResearchProjects (id_professor, project_title, start_date, end_date) VALUES
(1, 'AI for Healthcare', '2022-01-01', '2023-01-01');
INSERT INTO ResearchProjects (id_professor, project_title, start_date, end_date) VALUES
(2, 'Quantum Computing Applications', '2022-01-01', '2023-06-01');

INSERT INTO DepartmentsBudgets (id_department, fiscal_year, allocated_budget) VALUES
(1, 2022, 50000);
INSERT INTO DepartmentsBudgets (id_department, fiscal_year, allocated_budget) VALUES
(2, 2022, 40000);

INSERT INTO Clubs (id_president, club_name, creation_date, description) VALUES
(1, 'Robotics Club', NOW(), 'A club focused on building and programming robots.');
INSERT INTO Clubs (id_president, club_name, creation_date, description) VALUES
(2, 'Math Club', NOW(), 'A club where students solve complex math problems.');
