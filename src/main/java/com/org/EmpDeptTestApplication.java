package com.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmpDeptTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpDeptTestApplication.class, args);
		System.out.println("\nEmpDeptTestApplication :> localhost:8085\n");
	}

}
