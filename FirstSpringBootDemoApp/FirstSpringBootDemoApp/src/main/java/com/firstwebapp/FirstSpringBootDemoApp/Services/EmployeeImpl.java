package com.firstwebapp.FirstSpringBootDemoApp.Services;

import com.firstwebapp.FirstSpringBootDemoApp.Entity.Employee;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeImpl implements EmployeeService{

    List<Employee> list;

    public EmployeeImpl() {
        list = new ArrayList<>();
        list.add(new Employee(101, "Name1", "name1@email.com"));
        list.add(new Employee(102, "Name2", "name2@email.com"));
        list.add(new Employee(103, "Name3", "name3@email.com"));
    }

    @Override
    public List<Employee> getAllEmployees(){
        return list;
    }

    @Override
    public Employee getEmployeeById(int employeeID) {

        Employee c = null;
        for (Employee employee: list) {
            if(employee.getEmployeeid()==employeeID){
                c = employee;
                break;
            }
        }

        return c;
    }

    @Override
    public Employee addCourse(Employee employee) {
        list.add(employee);
        return employee;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        String employeeName = employee.getEmployeeName();
        String employeeEmail = employee.getEmployeeEmail();
        Employee c= null;
        for (Employee e: list) {
           if(e.getEmployeeid()==employee.getEmployeeid()){
            e.setEmployeeName(employeeName);
            e.setEmployeeEmail(employeeEmail);
            c=e;
            break;
           }
        }
        return c;
    }

    @Override
    public String deleteEmployeeById(int employeeID) {
        for (Employee employee:list) {
            if(employee.getEmployeeid()==employeeID){
                list.remove(employee);
                break;
            }
        }
        return "Deleted Successfully";
    }
}
