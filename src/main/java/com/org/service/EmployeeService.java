package com.org.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.model.Employee;
import com.org.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo empRepo;
	
	public List<Employee> getJoinedData() {
		// Use Spring Data JPA methods to fetch joined data
		return empRepo.findAll(); // This will automatically join with Table2/Department if the relationship is defined correctly
	}
	
}
