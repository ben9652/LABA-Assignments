package com.mysystem.app.services;

import com.mysystem.app.dao.ProfessorDAO;
import com.mysystem.app.models.Professor;

public class ProfessorService extends AbstractService<Professor, Integer> {
    public ProfessorService(ProfessorDAO dao) {
        super(dao);
    }
}
