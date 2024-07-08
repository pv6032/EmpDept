package com.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.model.Employee;
import com.org.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired EmployeeService empService;
	
	@GetMapping("/show")
	public List<Employee> getJoineddata() {
		return empService.getJoinedData();
	}
	
}
