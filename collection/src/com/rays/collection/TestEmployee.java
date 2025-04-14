package com.rays.collection;

import java.util.ArrayList;
import java.util.List;

public class TestEmployee {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(10, "Shiv", 60000));
		list.add(new Employee(20, "Harshit", 150000));
		list.add(new Employee(30, "Nikka", 5000));
		list.add(new Employee(40, "Nitin", 80000));

		System.out.println("Employee : " + list);
	}
}
