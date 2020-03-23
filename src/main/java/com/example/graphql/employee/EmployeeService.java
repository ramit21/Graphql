package com.example.graphql.employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	private List<Employee> employees;
	
	public EmployeeService() {
		employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "Employee One", 6));
		employees.add(new Employee(2, "Employee Two", 19));
	}

	public List<Employee> findAll() {
		return employees;
	}

}
