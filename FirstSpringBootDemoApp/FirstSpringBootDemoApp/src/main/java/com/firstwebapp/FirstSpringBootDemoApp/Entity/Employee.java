package com.firstwebapp.FirstSpringBootDemoApp.Entity;

public class Employee {

    private int employeeId;
    private String employeeName;
    private String employeeEmail;


    public Employee(){
    }

    public Employee(int employeeid, String employeeName, String employeeEmail){
        this.employeeId= employeeid;
        this.employeeName= employeeName;
        this.employeeEmail = employeeEmail;
    }

    public int getEmployeeid(){
        return employeeId;
    }

    public void setEmployeeid(int employeeid){
        this.employeeId=employeeid;
    }

    public String getEmployeeName(){
        return employeeName;
    }

    public void setEmployeeName(String employeeName){
        this.employeeName= employeeName;
    }

    public String getEmployeeEmail(){
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail){
        this.employeeEmail=employeeEmail;
    }
}
