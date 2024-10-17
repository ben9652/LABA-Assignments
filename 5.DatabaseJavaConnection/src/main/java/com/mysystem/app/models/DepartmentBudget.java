package com.mysystem.app.models;

public class DepartmentBudget {
    private int id;
    private int idDepartment;
    private int fiscalYear;
    private int allocatedBudget;

    public DepartmentBudget(int id, int idDepartment, int fiscalYear, int allocatedBudget) {
        this.id = id;
        this.idDepartment = idDepartment;
        this.fiscalYear = fiscalYear;
        this.allocatedBudget = allocatedBudget;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public int getIdDepartment() {
        return idDepartment;
    }
    public void setIdDepartment(int idDepartment) {
        this.idDepartment = idDepartment;
    }
    
    public int getFiscalYear() {
        return fiscalYear;
    }
    public void setFiscalYear(int fiscalYear) {
        this.fiscalYear = fiscalYear;
    }
    
    public int getAllocatedBudget() {
        return allocatedBudget;
    }
    public void setAllocatedBudget(int allocatedBudget) {
        this.allocatedBudget = allocatedBudget;
    }
}
