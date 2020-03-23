package com.example.graphql.query;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphql.employee.Employee;
import com.example.graphql.employee.EmployeeService;

public class Query implements GraphQLQueryResolver{

	private EmployeeService service;
	
	public Query(EmployeeService service) {
		this.service = service;
	}
	
	public List<Employee> employees(){
		return service.findAll();
	}
}
