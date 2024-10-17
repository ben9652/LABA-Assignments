UPDATE Professors
SET id_department = 1
WHERE id_professor = 1;

UPDATE Professors
SET id_department = 2
WHERE id_professor = 2;

UPDATE Departments
SET department_name = 'Computer Engineering'
WHERE id_department = 1;

UPDATE Professors
SET salary = 62000.00
WHERE id_professor = 1;

UPDATE Students
SET gpa = 3.9
WHERE id_student = 1;

UPDATE Courses
SET credits = 5
WHERE id_course = 1;

UPDATE Enrollments
SET grade = 90.5
WHERE id_enrollment = 1;

UPDATE Enrollments
SET grade = 85.0
WHERE id_enrollment = 2;

UPDATE ResearchProjects
SET project_title = 'Advanced AI Research'
WHERE id_project = 1;

UPDATE Classrooms
SET capacity = 60
WHERE id_classroom = 1;

UPDATE CoursesSchedules
SET start_time = '08:00:00'
WHERE id_schedule = 1;

UPDATE Exams
SET total_marks = 100
WHERE id_exam = 1;
