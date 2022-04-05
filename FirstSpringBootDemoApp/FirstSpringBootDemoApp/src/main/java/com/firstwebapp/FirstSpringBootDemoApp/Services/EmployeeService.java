package com.firstwebapp.FirstSpringBootDemoApp.Services;

import com.firstwebapp.FirstSpringBootDemoApp.Entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(int employeeID);
    Employee addCourse(Employee employee);
    Employee updateEmployee(Employee employee);
    String deleteEmployeeById(int employeeID);
}
