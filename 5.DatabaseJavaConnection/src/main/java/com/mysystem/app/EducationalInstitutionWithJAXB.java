package com.mysystem.app;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import java.io.File;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mysystem.app.models.Department;
import com.mysystem.app.models.Professor;
import com.mysystem.app.models.Student;

public class EducationalInstitutionWithJAXB {
    private static final Logger logger = LogManager.getLogger(EducationalInstitutionWithJAXB.class);

    public static void main(String[] args) {
        // Crear una lista de profesores
        List<Professor> professors = new ArrayList<>();
        professors.add(new Professor(1, "John", "Doe", Date.valueOf("2022-09-15"), 60000.0f));
        professors.add(new Professor(2, "Jane", "Smith", Date.valueOf("2020-08-10"), 65000.0f));

        // Crear una lista de estudiantes
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, 101, "Alice", "Johnson", Date.valueOf("2023-01-15"), 3.8f));
        students.add(new Student(2, 101, "Bob", "Williams", Date.valueOf("2022-09-10"), 3.5f));

        // Crear el objeto Department
        Department department = new Department(101, 1, "Computer Science", professors, students);

        try {
            JAXBContext context = JAXBContext.newInstance(Department.class);

            // Crear el Marshaller (serializador) para convertir el objeto en XML
            Marshaller marshaller = context.createMarshaller();

            // Establecer formato de salida con identación
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            // Escribir el objeto a un archivo XML
            marshaller.marshal(department, new File("files/department.xml"));

            // También puedes imprimir el XML en la consola
            marshaller.marshal(department, System.out);
        }
        catch(JAXBException ex) {
            logger.error(ex.getMessage());
        }
    }
}
