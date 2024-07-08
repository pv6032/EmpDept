package com.org.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.org.model.Department;
import com.org.model.Employee;
import com.org.repo.EmployeeRepo;

@Component
public class DataLoader implements CommandLineRunner {

	@Autowired
	private EmployeeRepo empRepo;
	
	@Override
	public void run(String... strings) throws Exception {
		Department dept1 = new Department("Mechanical"); 
		Employee emp1 = new Employee("Pankaj", 234454L, dept1);
		empRepo.save(emp1);
	}
}
