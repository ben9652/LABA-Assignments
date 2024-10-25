package com.mysystem.app.models;

import java.sql.Date;

public class Club {
    private int id;
    private int idPresident;
    private String clubName;
    private Date creationDate;
    private String description;
    
    public Club(int id, int idPresident, String clubName, Date creationDate, String description) {
        this.id = id;
        this.idPresident = idPresident;
        this.clubName = clubName;
        this.creationDate = creationDate;
        this.description = description;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public int getIdPresident() {
        return idPresident;
    }
    public void setIdPresident(int idPresident) {
        this.idPresident = idPresident;
    }
    
    public String getClubName() {
        return clubName;
    }
    public void setClubName(String clubName) {
        this.clubName = clubName;
    }
    
    public Date getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
    
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
