package com.mysystem.app.models;

import java.sql.Date;

public class CourseSchedule {
    private int id;
    private int idCourse;
    private int idClassroom;
    private String dayOfTheWeek;
    private Date startTime;
    private Date endTime;
    
    public CourseSchedule(int id, int idCourse, int idClassroom, String dayOfTheWeek, Date startTime, Date endTime) {
        this.id = id;
        this.idCourse = idCourse;
        this.idClassroom = idClassroom;
        this.dayOfTheWeek = dayOfTheWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public int getIdCourse() {
        return idCourse;
    }
    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }
    
    public int getIdClassroom() {
        return idClassroom;
    }
    public void setIdClassroom(int idClassroom) {
        this.idClassroom = idClassroom;
    }
    
    public String getDayOfTheWeek() {
        return dayOfTheWeek;
    }
    public void setDayOfTheWeek(String dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }
    
    public Date getStartTime() {
        return startTime;
    }
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    
    public Date getEndTime() {
        return endTime;
    }
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
