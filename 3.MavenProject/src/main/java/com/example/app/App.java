package com.example.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.example.data.structures.LinkedList;
import com.example.edu.university.Course;
import com.example.edu.university.Department;
import com.example.edu.university.University;
import com.example.edu.university.personnel.Gender;
import com.example.edu.university.personnel.Person;
import com.example.edu.university.personnel.faculty.AdjunctProfessor;
import com.example.edu.university.personnel.faculty.AssistantProfessor;
import com.example.edu.university.personnel.faculty.Faculty;
import com.example.edu.university.personnel.faculty.Professor;
import com.example.edu.university.personnel.staff.AdministrativeStaff;
import com.example.edu.university.personnel.staff.MaintenanceStaff;
import com.example.edu.university.personnel.staff.Staff;
import com.example.edu.university.personnel.staff.TechnicalStaff;
import com.example.edu.university.personnel.students.Graduate;
import com.example.edu.university.personnel.students.Student;
import com.example.edu.university.personnel.students.Undergraduate;
import com.example.exceptions.CourseNotFoundException;
import com.example.exceptions.InvalidAgeException;
import com.example.exceptions.InvalidPositionException;
import com.example.interfaces.Teachable;

public class App {
    private static final Logger logger = LogManager.getLogger(App.class);
    
    public static void main(String[] args) {
        Student undergrad = null;
        Student graduate = null;
        Faculty professor = null;
        Teachable teacher = null;
        Faculty assistantProfessor = null;
        Faculty adjunctProfessor = null;
        Faculty faculty = null;
        Staff adminStaff = null;
        Staff techStaff = null;
        Staff maintenanceStaff = null;
        
        try {
            // Crear un estudiante de grado
            undergrad = new Undergraduate("Alice", (short)20, Gender.FEMALE, 12345, "Computer Science", (short)2);
    
            // Crear un estudiante de posgrado
            graduate = new Graduate("Bob", (short)25, Gender.MALE, 54321, "Data Science", "AI in Healthcare");
    
            // Crear un profesor con titularidad
            professor = new Professor("Dr. Smith", (short)45, Gender.MALE, 67890, true);
    
            // Uso polimorfismo con la interfaz Teachable
            teacher = new Professor("Dr. Brown", (short)50, Gender.MALE, 54321, false);
    
            // Crear un profesor asistente
            assistantProfessor = new AssistantProfessor("Dr. Brown", (short)38, Gender.MALE, 54321, "Dr. Newton");
    
            // Crear un profesor adjunto
            adjunctProfessor = new AdjunctProfessor("Dr. Green", (short)50, Gender.MALE, 98765, 12);

            faculty = new Faculty("Dr. Smith", (short)38, Gender.MALE, 12039);
    
            // Crear un miembro del personal administrativo
            adminStaff = new AdministrativeStaff("John Doe", (short)30, Gender.MALE, 12345, "Registrar", "Room 101");
    
            // Crear un miembro del personal técnico
            techStaff = new TechnicalStaff("Jane Doe", (short)28, Gender.FEMALE, 67890, "IT Support", "Networking");
    
            // Crear un miembro del personal de mantenimiento
            maintenanceStaff = new MaintenanceStaff("Mark Smith", (short)40, Gender.MALE, 54321, "Janitor", "Night");

            ((Undergraduate)undergrad).enrollInCourse("Biology");
        }
        catch(InvalidAgeException ex) {
            logger.error(ex.getMessage());
        }
        catch(InvalidPositionException ex) {
            logger.error(ex.getMessage());
        }
        catch(CourseNotFoundException ex) {
            logger.error(ex.getMessage());
        }
        
        System.out.println();

        if(undergrad != null)
            logger.info(undergrad);
        System.out.println();

        if(graduate != null)
            logger.info(graduate);
        System.out.println();

        if(professor != null)
            logger.info(professor);
        System.out.println();

        if(assistantProfessor != null)
            logger.info(assistantProfessor);
        System.out.println();

        if(adjunctProfessor != null)
            logger.info(adjunctProfessor);
        System.out.println();

        if(adminStaff != null)
            logger.info(adminStaff);
        System.out.println();

        if(techStaff != null)
            logger.info(techStaff);
        System.out.println();

        if(maintenanceStaff != null)
            logger.info(maintenanceStaff);
        System.out.println();

        if(teacher != null)
            teacher.teach();
        System.out.println();
    
        System.out.println("Total people after creation: " + Person.getTotalPeople());

        /*** Uso de las colecciones creadas ***/
        Course maths = new Course("Mathematics 101", assistantProfessor);
        Course physics = new Course("Physics 101", adjunctProfessor);

        undergrad.enrollInCourse(physics);
        graduate.enrollInCourse(maths);

        assistantProfessor.addCourse(maths);
        adjunctProfessor.addCourse(physics);

        Department department1 = new Department("Science Department");
        department1.addFacultyMember(faculty);
        
        University university = new University("Tech University");
        university.addDepartment(department1);
        
        /*** Pruebas de la estructura de datos "Lista enlazada" ***/
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.Add(2);
        list.Add(5);
        list.Add(7);
        list.Add(10);
        list.Add(1);
        list.Add(23);
        list.PopElement(3);
        list.PopFirst();
        list.PopLast();

        list.Print();
    }
}
