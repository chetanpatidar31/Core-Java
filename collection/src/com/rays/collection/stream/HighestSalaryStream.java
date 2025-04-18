package com.rays.collection.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HighestSalaryStream {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(60000);
		list.add(100000);
		list.add(60000);
		list.add(90000);
		list.add(20000);
		list.add(70000);
		
		System.out.println("find Highest Salary");
		list.stream().distinct().sorted(Collections.reverseOrder()).findFirst().ifPresent(e-> System.out.println(e));
		
		System.out.println("find Second highest Salary");
		list.stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst().ifPresent(e-> System.out.println(e));
	}
}
