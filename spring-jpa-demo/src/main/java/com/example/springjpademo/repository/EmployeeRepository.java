package com.example.springjpademo.repository;

import com.example.springjpademo.entity.Employee;

import java.util.Optional;

public interface EmployeeRepository {


    Optional<Employee> save(Employee employee);
    Optional<Employee> getEmployeeById(Long id);
    void deleteEmployee(Employee employee);



}
