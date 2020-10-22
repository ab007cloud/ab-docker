package com.ab.repository;

import org.springframework.stereotype.Repository;

import com.ab.model.Employee;

@Repository
public class EmployeeRepository {

	public Employee listEmployees() {
		Employee employee = new Employee();
		employee.setEmployeeId(1);
		employee.setEmployeeName("AB");
		employee.setEmployeeSalary(100);

		return employee;
	}

}
