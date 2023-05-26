package com.example.springjpademo.repository;

import com.example.springjpademo.entity.Company;

import java.util.Optional;

public class CompanyRepositoryImpl implements CompanyRepository {

    @Override
    public Optional<Company> save(Company company){
       return Optional.empty();
    }
    @Override
    public  Optional<Company> getCompanyById(Long id){
        return Optional.empty();
    }
    @Override
    public void deleteEmployee(Company company){

    }








}
