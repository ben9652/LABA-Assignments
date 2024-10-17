ALTER TABLE Students
ADD email VARCHAR(100) NULL;

ALTER TABLE Departments
ADD location VARCHAR(100) NULL;

ALTER TABLE Professors
ADD phone_number VARCHAR(15) NULL;

ALTER TABLE ResearchProjects
ADD budget DECIMAL(10,2) NULL;

ALTER TABLE Courses
MODIFY course_name VARCHAR(150);
