package com.personal.fullstack.services.employee;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.fullstack.model.Employee;
import com.personal.fullstack.repository.EmployeeRepository;

@Service
public class EmployeeServicesImpl implements EmployeeServices{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmployee() {
        return employeeRepository.findAll();
       
    }
    
}
