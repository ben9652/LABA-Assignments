-- Cantidad de estudiantes por departamento
SELECT d.department_name, COUNT(s.id_student) AS total_students
FROM Students s
JOIN Departments d ON s.id_department = d.id_department
GROUP BY d.department_name;

-- Promedio de GPA por departamento
SELECT d.department_name, AVG(s.gpa) AS avg_gpa
FROM Students s
JOIN Departments d ON s.id_department = d.id_department
GROUP BY d.department_name;

-- Total de créditos por curso
SELECT c.course_name, SUM(c.credits) AS total_credits
FROM Courses c
GROUP BY c.course_name;

-- Máximo salario por departamento
SELECT d.department_name, MAX(p.salary) AS max_salary
FROM Professors p
JOIN Departments d ON p.id_department = d.id_department
GROUP BY d.department_name;

-- Cantidad de exámenes por curso
SELECT c.course_name, COUNT(e.id_exam) AS total_exams
FROM Exams e
JOIN Courses c ON e.id_course = c.id_course
GROUP BY c.course_name;

-- Número de estudiantes por examen
SELECT e.exam_type, COUNT(se.id_student_exam) AS total_students
FROM Exams e
JOIN StudentsExams se ON e.id_exam = se.id_exam
GROUP BY e.exam_type;

-- Suma del presupuesto asignado por departamento
SELECT d.department_name, SUM(db.allocated_budget) AS total_budget
FROM DepartmentsBudgets db
JOIN Departments d ON db.id_department = d.id_department
GROUP BY d.department_name;
