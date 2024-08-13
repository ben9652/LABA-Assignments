import persons.Gender;
import persons.faculty.AdjunctProfessor;
import persons.faculty.AssistantProfessor;
import persons.faculty.Faculty;
import persons.faculty.Professor;
import persons.staff.AdministrativeStaff;
import persons.staff.MaintenanceStaff;
import persons.staff.Staff;
import persons.staff.TechnicalStaff;
import persons.students.Graduate;
import persons.students.Student;
import persons.students.Undergraduate;

public class Main {
    public static void main(String[] args) {
        // Crear un estudiante de grado
        Student undergrad = new Undergraduate("Alice", (short)20, Gender.FEMALE, 12345, "Computer Science", (short)2);

        // Crear un estudiante de posgrado
        Student graduate = new Graduate("Bob", (short)25, Gender.MALE, 54321, "Data Science", "AI in Healthcare");

        // Crear un profesor con titularidad
        Faculty professor = new Professor("Dr. Smith", (short)45, Gender.MALE, 67890, true);

        // Crear un profesor asistente
        Faculty assistantProfessor = new AssistantProfessor("Dr. Brown", (short)38, Gender.MALE, 54321, "Dr. Newton");

        // Crear un profesor adjunto
        Faculty adjunctProfessor = new AdjunctProfessor("Dr. Green", (short)50, Gender.MALE, 98765, 12);

        // Crear un miembro del personal administrativo
        Staff adminStaff = new AdministrativeStaff("John Doe", (short)30, Gender.MALE, 12345, "Registrar", "Room 101");

        // Crear un miembro del personal técnico
        Staff techStaff = new TechnicalStaff("Jane Doe", (short)28, Gender.FEMALE, 67890, "IT Support", "Networking");

        // Crear un miembro del personal de mantenimiento
        Staff maintenanceStaff = new MaintenanceStaff("Mark Smith", (short)40, Gender.MALE, 54321, "Janitor", "Night");
        
        System.out.println();
        System.out.println(undergrad);
        System.out.println();
        System.out.println(graduate);
        System.out.println();
        System.out.println(professor);
        System.out.println();
        System.out.println(assistantProfessor);
        System.out.println();
        System.out.println(adjunctProfessor);
        System.out.println();
        System.out.println(adminStaff);
        System.out.println();
        System.out.println(techStaff);
        System.out.println();
        System.out.println(maintenanceStaff);
    }
}