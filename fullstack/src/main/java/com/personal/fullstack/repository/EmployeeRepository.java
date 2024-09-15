package com.personal.fullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.personal.fullstack.model.Employee;

@Repository
@EnableJpaRepositories
@EnableTransactionManagement
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
    
}
