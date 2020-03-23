package com.example.graphql.query;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.graphql.employee.Employee;
import com.example.graphql.employee.EmployeeService;

public class Mutation implements GraphQLMutationResolver{

	private EmployeeService service;
	
	public Mutation(EmployeeService service) {
		this.service = service;
	}
	
	public Employee addEmployee(int id, String name, int yearsOfService){
		return service.createEmployee(id, name, yearsOfService);
	}
}
