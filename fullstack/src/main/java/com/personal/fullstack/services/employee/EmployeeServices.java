package com.personal.fullstack.services.employee;
import java.util.List;

import com.personal.fullstack.model.Employee;

public interface EmployeeServices {
    
    public List<Employee> getEmployee();

    public Employee saveEmployee(Employee employee);

}
