package com.mysystem.app;

import java.sql.Date;
import java.util.List;

import com.mysystem.app.dao.ProfessorDAO;
import com.mysystem.app.models.Professor;

public class App {
    public static void main(String[] args) {
        ProfessorDAO dao = new ProfessorDAO();

        Professor p1 = new Professor("John", "Doe", new Date(System.currentTimeMillis()), 6000);
        Professor p2 = new Professor("Jane", "Smith", new Date(System.currentTimeMillis()), 6000);
        Professor p3 = new Professor("Chris", "Brown", new Date(System.currentTimeMillis()), 6000);

        dao.create(p1);
        dao.create(p2);

        p3.setSalary(6200);
        dao.update(p3);

        dao.delete(p2);

        List<Professor> professors = dao.findAll();
        for(Professor p : professors) {
            System.out.println(p);
        }

    }
}
