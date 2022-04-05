package com.firstwebapp.FirstSpringBootDemoApp.Controller;


import com.firstwebapp.FirstSpringBootDemoApp.Entity.Employee;
import com.firstwebapp.FirstSpringBootDemoApp.Entity.Employee;
import com.firstwebapp.FirstSpringBootDemoApp.Services.EmployeeService;

import com.firstwebapp.FirstSpringBootDemoApp.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private EmployeeService employeeService;

//    @GetMapping("/")
//    public String home(@RequestParam(value="name", defaultValue="World") String name, @RequestParam(value="age", defaultValue="0") String age){
//        return "Hello "+name+age;
//    }
    @GetMapping("/courses")
    public List<Employee> getEmployees(){
        return this.employeeService.getAllEmployees();
    }

    @GetMapping("/courses/{employeeID}")
    public Employee getEmployee(@PathVariable String employeeID){
        return this.employeeService.getEmployeeById(Integer.parseInt(employeeID));
    }

    @PostMapping("/courses")
    public Employee addEmployee(@RequestBody Employee employee){
        return this.employeeService.addCourse(employee);
    }

    @PutMapping("/courses")
    public Employee updateEmployee(@RequestBody Employee employee){
        return this.employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/courses/{employeeID}")
    public String deleteEmployee(@PathVariable String employeeID){
        return this.employeeService.deleteEmployeeById(Integer.parseInt(employeeID));
    }
}
