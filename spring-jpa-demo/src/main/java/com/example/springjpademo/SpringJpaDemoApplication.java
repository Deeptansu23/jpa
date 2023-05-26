package com.example.springjpademo;

import com.example.springjpademo.entity.Company;
import com.example.springjpademo.entity.Employee;
import com.example.springjpademo.entity.Salary;
import com.example.springjpademo.repository.EmployeeRepository;
import com.example.springjpademo.repository.EmployeeRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

@SpringBootApplication
public class SpringJpaDemoApplication {
	@PersistenceContext
	EntityManager entityManager;
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=
				Persistence.createEntityManagerFactory("default");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		System.out.println("connected properly.");
		EmployeeRepositoryImpl employeeRepository=
				new EmployeeRepositoryImpl(entityManager);



		Employee employee=new Employee();
		employee.setFName("john");
		employee.setLName("dao");
		employee.setYearsExperience(20);
		employee.setSalary(new Salary(54000.00,true));
		employee.setCompany(new Company("MyCompany"));

		Employee employee1=new Employee();
		employee1.setFName("danny");
		employee1.setLName("max");
		employee1.setYearsExperience(21);
		employee1.setSalary(new Salary(54000.00,true));
		employee1.setCompany(new Company("MyCompany"));

		Employee employee2=new Employee();
		employee1.setFName("ronny");
		employee1.setLName("jain");
		employee1.setYearsExperience(22);
		employee1.setSalary(new Salary(64000.00,true));
		employee1.setCompany(new Company("MyCompany"));

		employeeRepository.save(employee);
		employeeRepository.save(employee1);
//		employeeRepository.save(employee2);

		System.out.println(employeeRepository.getEmployeeById(1l));
		System.out.println(employeeRepository.getEmployeeById(2l));

		employeeRepository.deleteEmployee(employee2);



		entityManager.close();
		entityManagerFactory.close();
	}

}
