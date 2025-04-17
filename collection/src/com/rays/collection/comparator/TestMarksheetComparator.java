package com.rays.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMarksheetComparator {
	public static void main(String[] args) {
		List<Marksheet> list = new ArrayList<Marksheet>();

		list.add(new Marksheet(105, "Ram", 85));
		list.add(new Marksheet(103, "Aman", 46));
		list.add(new Marksheet(101, "Pawan", 72));
		list.add(new Marksheet(104, "Uday", 55));
		list.add(new Marksheet(102, "Shyam", 33));

		System.out.println("----natural order----");
		list.forEach(System.out::println);

		System.out.println("----byRollNo----");
		OrderByRollNo byRollNo = new OrderByRollNo();
		Collections.sort(list, byRollNo);
		list.forEach(System.out::println);

		System.out.println("--byName--");
		OrderByName byName = new OrderByName();
		Collections.sort(list, byName);
		list.forEach(System.out::println);

		System.out.println("--byPhysics--");
		OrderByPhysics byPhysics = new OrderByPhysics();
		Collections.sort(list, byPhysics);
		list.forEach(System.out::println);
	}
}
