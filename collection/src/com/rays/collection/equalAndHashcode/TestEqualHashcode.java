package com.rays.collection.equalAndHashcode;

public class TestEqualHashcode {
	public static void main(String[] args) {
		
		Employee e1=new Employee(11, "Ram", 90000);
		Employee e2=new Employee(11, "Ram", 90000);
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
	}
}
