-- INNER JOIN
SELECT s.first_name, c.course_name
FROM Students s
INNER JOIN Enrollments e ON s.id_student = e.id_student
INNER JOIN Courses c ON e.id_course = c.id_course;

-- LEFT JOIN
SELECT d.department_name, p.first_name
FROM Departments d
LEFT JOIN Professors p ON d.id_department = p.id_department;

-- RIGHT JOIN
SELECT rp.project_title, p.last_name
FROM Professors p
RIGHT JOIN ResearchProjects rp ON p.id_professor = rp.id_professor;

-- FULL OUTER JOIN
SELECT s.first_name, c.club_name
FROM Students s
LEFT JOIN Clubs c ON s.id_student = c.id_president
UNION
SELECT s.first_name, c.club_name
FROM Students s
RIGHT JOIN Clubs c ON s.id_student = c.id_president;

-- LEFT JOIN con condición
SELECT co.course_name, cs.start_time
FROM Courses co
LEFT JOIN CoursesSchedules cs ON co.id_course = cs.id_course
WHERE cs.start_time IS NOT NULL;
