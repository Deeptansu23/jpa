package com.example.springjpademo.repository;

import com.example.springjpademo.entity.Employee;

import javax.persistence.EntityManager;
import java.util.Optional;

public class EmployeeRepositoryImpl implements EmployeeRepository{
    EntityManager entityManager;

    public EmployeeRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }



    @Override
    public Optional<Employee> save(Employee employee){
        entityManager.getTransaction().begin();
        if (employee.getId()==null){
            System.out.println("It is Persisted");
            entityManager.persist(employee);//insert
        }
        else {
            System.out.println("It is Merged");
            employee = entityManager.merge(employee);//merge
        }



        entityManager.getTransaction().commit();
        return Optional.empty();
   }

    @Override
    public Optional<Employee> getEmployeeById(Long id){
        Employee employee=entityManager.find(Employee.class,id);


       return employee!=null ?Optional.of(employee):Optional.empty();
    }

    @Override
    public void deleteEmployee(Employee employee){
        entityManager.getTransaction().begin();
        if (entityManager.contains(employee)) {
            System.out.println("deleted");
            entityManager.remove(employee);
        }
        else {
            System.out.println("not found");
            entityManager.merge(employee);
        }


        entityManager.getTransaction().commit();
    }


}
