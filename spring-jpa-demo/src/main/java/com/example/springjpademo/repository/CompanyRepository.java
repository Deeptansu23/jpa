package com.example.springjpademo.repository;

import com.example.springjpademo.entity.Company;
import com.example.springjpademo.entity.Employee;

import java.util.Optional;

public interface CompanyRepository {
    Optional<Company> save(Company company);
    Optional<Company> getCompanyById(Long id);
    void deleteEmployee(Company company);





}
