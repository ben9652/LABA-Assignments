package com.mysystem.app.models;

import java.sql.Date;

public class ResearchProject {
    private int id;
    private int idProfessor;
    private String projectTitle;
    private Date startDate;
    private Date endDate;

    public ResearchProject(int id, int idProfessor, String projectTitle, Date startDate, Date endDate) {
        this.id = id;
        this.idProfessor = idProfessor;
        this.projectTitle = projectTitle;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public int getIdProfessor() {
        return idProfessor;
    }
    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }
    
    public String getProjectTitle() {
        return projectTitle;
    }
    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }
    
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    
    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
