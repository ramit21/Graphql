package com.example.graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.graphql.employee.EmployeeService;
import com.example.graphql.query.Mutation;
import com.example.graphql.query.Query;

@SpringBootApplication
public class GraphqlApplication {

	@Autowired
	private EmployeeService employeeService;
	
	@Bean
	public Query query() {
		return new Query(employeeService);
	}
	
	@Bean
	public Mutation mutation() {
		return new Mutation(employeeService);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(GraphqlApplication.class, args);
	}

}
