package com.example.graphql.employee;

public class Employee {

	private long id;
	private String name;
	private int yearsOfService;

	public Employee(int id, String name, int yearsOfService) {
		this.id = id;
		this.name = name;
		this.yearsOfService = yearsOfService;
	}

	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public int getYearsOfService() {
		return yearsOfService;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setYearsOfService(int yearsOfService) {
		this.yearsOfService = yearsOfService;
	}

}
