package com.mysystem.app;

import java.sql.Date;
import java.util.List;

import com.mysystem.app.dao.ProfessorDAO;
import com.mysystem.app.models.Professor;
import com.mysystem.app.services.ProfessorService;

public class App {
    public static void main(String[] args) {
        ProfessorDAO dao = new ProfessorDAO();
        ProfessorService pService = new ProfessorService(dao);

        Professor p1 = new Professor("John", "Doe", new Date(System.currentTimeMillis()), 6000);
        Professor p2 = new Professor("Jane", "Smith", new Date(System.currentTimeMillis()), 6000);
        Professor p3 = new Professor("Chris", "Brown", new Date(System.currentTimeMillis()), 6000);

        pService.save(p1);
        pService.save(p2);

        p3.setSalary(6200);
        pService.modify(p3);

        pService.remove(p2);

        List<Professor> professors = pService.getAll();
        for(Professor p : professors) {
            System.out.println(p);
        }

    }
}
