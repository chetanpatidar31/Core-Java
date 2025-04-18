package com.rays.collection.stream;

import java.util.ArrayList;
import java.util.List;

public class TestEmployee {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee(8000, "Gopal"));
		list.add(new Employee(5000, "Harshit"));
		list.add(new Employee(9000, "Aastik"));
		list.add(new Employee(4000, "Tanish"));
		list.add(new Employee(9333, "Nitin"));
		list.add(new Employee(8533, "Shiv"));
		list.add(new Employee(9000, "Aastik"));
		list.add(new Employee(9000, "Chetan"));
		list.add(new Employee(14000, "Shubham"));
		list.add(new Employee(14000, "Shubham"));
		
		System.out.println("get list---------");
		list.stream().forEach(System.out::println);
		
		System.out.println("remove duplicate-----");
		list.stream().distinct().forEach(System.out::println);
	}
}
