package com.example.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.example.exceptions.CourseNotFoundException;
import com.example.exceptions.InvalidAgeException;
import com.example.exceptions.InvalidPositionException;
import com.example.interfaces.Teachable;
import com.example.persons.Gender;
import com.example.persons.Person;
import com.example.persons.faculty.AdjunctProfessor;
import com.example.persons.faculty.AssistantProfessor;
import com.example.persons.faculty.Faculty;
import com.example.persons.faculty.Professor;
import com.example.persons.staff.AdministrativeStaff;
import com.example.persons.staff.MaintenanceStaff;
import com.example.persons.staff.Staff;
import com.example.persons.staff.TechnicalStaff;
import com.example.persons.students.Graduate;
import com.example.persons.students.Student;
import com.example.persons.students.Undergraduate;

public class App {
    private static final Logger logger = LogManager.getLogger(App.class);
    
    public static void main(String[] args) {
        Student undergrad = null;
        Student graduate = null;
        Faculty professor = null;
        Teachable teacher = null;
        Faculty assistantProfessor = null;
        Faculty adjunctProfessor = null;
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
    }
}
