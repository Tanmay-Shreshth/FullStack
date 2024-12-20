package com.personal.fullstack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personal.fullstack.model.Employee;
import com.personal.fullstack.services.employee.EmployeeServices;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {
    
    @Autowired
    private EmployeeServices employeeServices;

    @GetMapping("/welcome")
    public String welcome(){
        return "welcome";
    }

    @GetMapping("/get")
    public List<Employee> getAllEmployees(){
        return employeeServices.getEmployee();
    }

    @PostMapping("/createEmployee")
    public Employee creatEmployee(@RequestBody Employee employee){
        return employeeServices.saveEmployee(employee);
    }
}
