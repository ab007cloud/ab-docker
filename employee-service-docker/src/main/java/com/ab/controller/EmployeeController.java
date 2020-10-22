package com.ab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ab.model.Employee;
import com.ab.service.EmployeeService;

@RestController

public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employees")
	public Employee listEmployees() {

		return employeeService.listEmployees();
	}

}
