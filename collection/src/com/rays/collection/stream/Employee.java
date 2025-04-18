package com.rays.collection.stream;

public class Employee {
	private Integer salary;
	private String name;

	public Employee(Integer salary, String name) {
		this.salary = salary;
		this.name = name;
	}

	public String name() {
		return name;
	}

	public Integer salary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Name: " + name + "\t Salary: " + salary;
	}

}
