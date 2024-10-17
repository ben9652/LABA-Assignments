-- Departamentos con más de 2 estudiantes
SELECT d.department_name, COUNT(s.id_student) AS total_students
FROM Students s
JOIN Departments d ON s.id_department = d.id_department
GROUP BY d.department_name
HAVING COUNT(s.id_student) > 2;

-- Cursos con más de 3 créditos
SELECT c.course_name, SUM(c.credits) AS total_credits
FROM Courses c
GROUP BY c.course_name
HAVING SUM(c.credits) > 3;

-- Profesores con salario mayor a 50000
SELECT p.first_name, p.last_name, MAX(p.salary) AS max_salary
FROM Professors p
GROUP BY p.first_name, p.last_name
HAVING MAX(p.salary) > 50000;

-- Estudiantes con GPA mayor a 3.5
SELECT s.first_name, s.last_name, AVG(s.gpa) AS avg_gpa
FROM Students s
GROUP BY s.first_name, s.last_name
HAVING AVG(s.gpa) > 3.5;

-- Exámenes con más de 90 puntos
SELECT e.exam_type, AVG(se.marks_obtained) AS avg_marks
FROM Exams e
JOIN StudentsExams se ON e.id_exam = se.id_exam
GROUP BY e.exam_type
HAVING AVG(se.marks_obtained) > 90;

-- Departamentos con más de 50000 de presupuesto
SELECT d.department_name, SUM(db.allocated_budget) AS total_budget
FROM DepartmentsBudgets db
JOIN Departments d ON d.id_department = d.id_department
GROUP BY d.department_name
HAVING SUM(db.allocated_budget) > 50000;

-- Aulas con capacidad mayor a 50
SELECT c.room_number, c.building, MAX(c.capacity) AS max_capacity
FROM Classrooms c
GROUP BY c.room_number, c.building
HAVING MAX(c.capacity) > 50;
