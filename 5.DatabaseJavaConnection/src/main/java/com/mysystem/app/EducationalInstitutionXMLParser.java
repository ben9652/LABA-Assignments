package com.mysystem.app;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mysystem.app.models.Department;

public class EducationalInstitutionXMLParser {
    private static final Logger logger = LogManager.getLogger(EducationalInstitutionXMLParser.class);
    
    public static void main(String[] args) {
        String xmlFile = "files/EducationalInstitution.xml";

        List<Department> departments = new ArrayList<>();

        try {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            FileInputStream fileInputStream = new FileInputStream(xmlFile);
            XMLStreamReader reader = factory.createXMLStreamReader(fileInputStream);
            XMLEventReader eventReader = factory.createXMLEventReader(reader);

            // Variables para almacenar los datos de cada departamento
            String idDepartment = "";
            String departmentName = "";
            String idHeadProfessor = "";

            System.out.println();

            // Leer el archivo XML de forma secuencial
            while (eventReader.hasNext()) {
                XMLEvent event = eventReader.nextEvent();

                // Comprobar el tipo de evento
                if (event.isStartElement()) {
                    StartElement startElement = event.asStartElement();

                    // Si encontramos el inicio de la etiqueta 'Department', inicializamos los valores
                    if (startElement.getName().getLocalPart().equals("Department")) {
                        idDepartment = "";
                        departmentName = "";
                        idHeadProfessor = "";
                    }

                    // Si encontramos la etiqueta 'id_department', obtener el valor
                    if (startElement.getName().getLocalPart().equals("id_department")) {
                        event = eventReader.nextEvent();
                        idDepartment = event.asCharacters().getData();
                    }

                    // Si encontramos la etiqueta 'department_name', obtener el valor
                    if (startElement.getName().getLocalPart().equals("department_name")) {
                        event = eventReader.nextEvent();
                        departmentName = event.asCharacters().getData();
                    }

                    // Si encontramos la etiqueta 'id_head_professor', obtener el valor
                    if (startElement.getName().getLocalPart().equals("id_head_professor")) {
                        event = eventReader.nextEvent();
                        idHeadProfessor = event.asCharacters().getData();
                    }
                }

                // Si encontramos el final de la etiqueta 'Department', procesamos los datos
                if (event.isEndElement() && event.asEndElement().getName().getLocalPart().equals("Department")) {
                    departments.add(new Department(Integer.valueOf(idDepartment), Integer.valueOf(idHeadProfessor), departmentName));
                    System.out.println();
                }
            }
        }
        catch(Exception ex) {
            logger.error(ex.getMessage());
        }

        for(Department d : departments) {
            System.out.println(d);
        }
    }
}
