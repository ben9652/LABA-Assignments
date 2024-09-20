package com.example.app;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.apache.commons.lang3.StringUtils;
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
        Professor professor2;

        // Predicate genérico: verifica si un objeto no es null
        Predicate<Object> isNotNull = obj -> obj != null;
        
        try {
            // Crear un estudiante de grado
            undergrad = new Undergraduate("Alice", (short)20, Gender.FEMALE, 12345, "Computer Science", (short)2);
    
            // Crear un estudiante de posgrado
            graduate = new Graduate("Bob", (short)25, Gender.MALE, 54321, "Data Science", "AI in Healthcare");
    
            // Crear un profesor con titularidad
            professor = new Professor("Dr. Smith", (short)45, Gender.MALE, 67890, true, 15);
            professor2 = new Professor("Dr. Tyler", (short)36, Gender.MALE, 56134, true, 4);

            // Uso polimorfismo con la interfaz Teachable
            teacher = new Professor("Dr. Brown", (short)50, Gender.MALE, 54321, false, 12);
    
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

            // Verificar si el estudiante ha aprobado
            Predicate<Student> isApproved = student -> student.getGrade() >= 6;
    
            // Función para transformar el tipo de dato Student a uno String
            Function<Student, String> getName = student -> student.getName();
    
            // Imprimir la información de un miembro de la facultad
            Consumer<Faculty> printFacultyInfo = facultyVar -> System.out.println("Faculty ID: " + facultyVar.getFacultyId() + ", Faculty name: " + facultyVar.getName());

            // Proveer un curso
            Supplier<Course> courseSupplier = () -> new Course("Data Structures", professor2);

            // Comparar dos profesores
            Comparator<Faculty> compareByName = (fac1, fac2) -> StringUtils.compare(fac1.getName(), fac2.getName());


            // Uso de Predicate
            System.out.println("Is student approved so far: " + isApproved.test(graduate));

            // Uso de Function
            System.out.println("Student name: " + getName.apply(graduate));

            // Uso de Consumer
            printFacultyInfo.accept(faculty);

            // Uso de Supplier
            Course course = courseSupplier.get();
            System.out.println("Course: " + course.getCourseName() + ", Instructor: " + course.getInstructor());

            // Uso de Comparator
            int comparisonResult = compareByName.compare(faculty, professor);
            if(comparisonResult == 0) {
                System.out.println("There are two faculty with the same last name");
            }

            // Function genérica: convierte cualquier objeto a su representación String
            Function<Object, String> objectToString = obj -> obj.toString();
            String teacherString = objectToString.apply(teacher);

            // BiFunction genérico: suma dos números de cualquier tipo
            BiFunction<Number, Number, Double> sumNumbers = (num1, num2) -> num1.doubleValue();
            Double sumResult = sumNumbers.apply(23, 52);
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

        if(isNotNull.test(undergrad))
            logger.info(undergrad);
        System.out.println();

        if(isNotNull.test(graduate))
            logger.info(graduate);
        System.out.println();

        if(isNotNull.test(professor))
            logger.info(professor);
        System.out.println();

        if(isNotNull.test(assistantProfessor))
            logger.info(assistantProfessor);
        System.out.println();

        if(isNotNull.test(adjunctProfessor))
            logger.info(adjunctProfessor);
        System.out.println();

        if(isNotNull.test(adminStaff))
            logger.info(adminStaff);
        System.out.println();

        if(isNotNull.test(techStaff))
            logger.info(techStaff);
        System.out.println();

        if(isNotNull.test(maintenanceStaff))
            logger.info(maintenanceStaff);
        System.out.println();

        if(isNotNull.test(teacher))
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

        System.out.println();

        /**** USO DE RELFECTIONS ****/
        Class<?> studentClass = Student.class;

        // Extraigo información sobre los campos
        System.out.println("Fields:");
        for(Field field : studentClass.getDeclaredFields()) {
            System.out.println("Field name: " + field.getName());
            System.out.println("Type: " + field.getType().getSimpleName());
            System.out.println("Modifiers: " + Modifier.toString(field.getModifiers()));
            System.out.println();
        }

        // Extraer información sobre los constructores
        System.out.println("\nConstructors:");
        for (Constructor<?> constructor : studentClass.getConstructors()) {
            System.out.println("Constructor: " + constructor);
            System.out.println("Parameter Types:");
            for (Class<?> paramType : constructor.getParameterTypes()) {
                System.out.println(" - " + paramType.getSimpleName());
            }
        }

        // Extraer información sobre los métodos
        System.out.println("\nMethods:");
        for (Method method : studentClass.getMethods()) {
            System.out.println("Method Name: " + method.getName());
            System.out.println("Return Type: " + method.getReturnType().getSimpleName());
            System.out.println("Modifiers: " + Modifier.toString(method.getModifiers()));
            System.out.println("Parameter Types:");
            for (Class<?> paramType : method.getParameterTypes()) {
                System.out.println(" - " + paramType.getSimpleName());
            }
        }

        try {
            // Crear un objeto Undergraduate usando reflection
            Constructor<?> constructor = studentClass.getConstructor(String.class, short.class, Gender.class, int.class, String.class);
            Object student = constructor.newInstance("Alice", (short)21, Gender.FEMALE, 101, "Biology");
    
            // Llamar a un método usando reflection
            Method setGpaMethod = studentClass.getMethod("setGrade", double.class);
            setGpaMethod.invoke(student, 4.0);  // Cambiar el promedio
    
            // Llamar a toString para verificar los cambios
            Method toStringMethod = studentClass.getMethod("toString");
            System.out.println("\nUpdated Student: " + toStringMethod.invoke(student));

        }
        catch(Exception ex) {
            logger.error(ex.getMessage());
        }
    }
}
