package com.mysystem.app.models;

public class Classroom {
    private int id;
    private String roomNumber;
    private String building;
    private int capacity;

    public Classroom(int id, String roomNumber, String building, int capacity) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.building = building;
        this.capacity = capacity;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public String getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
    
    public String getBuilding() {
        return building;
    }
    public void setBuilding(String building) {
        this.building = building;
    }
    
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
