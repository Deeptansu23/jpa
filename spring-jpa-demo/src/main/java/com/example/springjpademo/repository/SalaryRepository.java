package com.example.springjpademo.repository;

import com.example.springjpademo.entity.Salary;

import java.util.Optional;

public interface SalaryRepository {


    Optional<Salary> save(Salary salary);
    Optional<Salary> getSalaryById(Long id);
    void deleteEmployee(Salary salary);



}
