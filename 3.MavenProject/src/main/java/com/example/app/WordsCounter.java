package com.example.app;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WordsCounter {
    private static final Logger logger = LogManager.getLogger(App.class);
    
    public static void main(String[] args) {
        try {
            String content = FileUtils.readFileToString(new File("./src/main/files/input.txt"), "UTF-8");

            String[] words = StringUtils.split(content.toLowerCase(), " \n\r\t");

            Set<String> uniqueWords = new HashSet<>();
            for(String word : words)
                uniqueWords.add(word);

            // Escribo el número de palabras únicas en un archivo de salida
            FileUtils.writeStringToFile(new File("./src/main/files/output.txt"), "Unique words count: " + uniqueWords.size(), "UTF-8");
        }
        catch (IOException e) {
            e.printStackTrace();
            logger.error(e.getMessage());
        }
    }
}
