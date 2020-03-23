package com.example.graphql.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

	public Employee findById(int id) {
		Optional<Employee> employee = employees.stream().filter(e->e.getId() == id).findFirst();
		if(employee.isPresent()) {
			return employee.get();
		}
		return null;
	}

	public Employee createEmployee(int id, String name, int yearsOfService) {
		Employee employee = new Employee(id, name, yearsOfService);
		employees.add(employee);
		return employee;
	}
}
