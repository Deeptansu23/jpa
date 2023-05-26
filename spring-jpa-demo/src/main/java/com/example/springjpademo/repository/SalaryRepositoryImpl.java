package com.example.springjpademo.repository;

import com.example.springjpademo.entity.Salary;

import java.util.Optional;

public class SalaryRepositoryImpl implements  SalaryRepository{

    @Override
    public Optional<Salary> save(Salary salary){
       return Optional.empty();
   }
    @Override
    public Optional<Salary> getSalaryById(Long id) {
        return Optional.empty();
    }
    @Override
    public void deleteEmployee(Salary salary){

    }






}
