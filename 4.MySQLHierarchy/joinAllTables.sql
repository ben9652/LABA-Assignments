SELECT * 
FROM Students s
JOIN Departments d ON s.id_department = d.id_department
JOIN Professors p ON d.id_head_professor = p.id_professor
JOIN Enrollments en ON s.id_student = en.id_student
JOIN Courses co ON en.id_course = co.id_course
JOIN CoursesSchedules cs ON co.id_course = cs.id_course
JOIN Classrooms cr ON cs.id_classroom = cr.id_classroom
JOIN Exams e ON co.id_course = e.id_course
JOIN StudentsExams se ON s.id_student = se.id_student
JOIN Clubs c ON s.id_student = c.id_president
JOIN ResearchProjects rp ON p.id_professor = rp.id_professor
;
