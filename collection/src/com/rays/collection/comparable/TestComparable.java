package com.rays.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {
	public static void main(String[] args) {
		List<Marksheet> list = new ArrayList<Marksheet>();
		
		list.add(new Marksheet(103, "Amit", 85));
		list.add(new Marksheet(101, "Udit", 95));
		list.add(new Marksheet(104, "Karan", 75));
		list.add(new Marksheet(102, "Mohit", 45));
		
		list.forEach(System.out::println);
		
		System.out.println("-----------------");
		
		Collections.sort(list);
		
		list.forEach(System.out::println);
		
	}
}
