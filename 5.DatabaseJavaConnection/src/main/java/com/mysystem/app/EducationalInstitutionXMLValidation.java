package com.mysystem.app;

import java.io.FileInputStream;
import java.io.InputStream;

import javax.xml.XMLConstants;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EducationalInstitutionXMLValidation {
    private static final Logger logger = LogManager.getLogger(EducationalInstitutionXMLValidation.class);
    
    public static void main(String[] args) {
        String xmlFile = "files/EducationalInstitution.xml";
        String xsdFile = "files/EducationalInstitution.xsd";

        try {
            SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = schemaFactory.newSchema(new StreamSource(xsdFile));

            Validator validator = schema.newValidator();

            XMLInputFactory factory = XMLInputFactory.newInstance();
            InputStream xmlInputStream = new FileInputStream(xmlFile);
            XMLStreamReader reader = factory.createXMLStreamReader(xmlInputStream);

            validator.validate(new StreamSource(xmlInputStream));

            logger.info("Valid XML file according to the XSD scheme");

            reader.close();
            xmlInputStream.close();
        }
        catch(Exception ex) {
            logger.error(ex.getMessage());
        }
    }
}
