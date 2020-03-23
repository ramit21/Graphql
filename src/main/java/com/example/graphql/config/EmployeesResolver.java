package com.example.graphql.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.graphql.employee.Employee;
import com.example.graphql.employee.EmployeeService;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

@Component
public class EmployeesResolver implements DataFetcher<List<Employee>> {//Datafetcher as used in config class
	
	@Autowired
	private EmployeeService service;
	
    @Override
    public List<Employee> get(DataFetchingEnvironment environment) {
        return service.findAll();
    }
}
