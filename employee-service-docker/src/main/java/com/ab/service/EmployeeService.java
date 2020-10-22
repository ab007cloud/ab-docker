package com.ab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ab.model.Employee;
import com.ab.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee listEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.listEmployees();
	}

}
