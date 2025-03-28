package com.rays.oop.encapsulation;

public class Sum {
	public Sum() {
		System.out.println("This is defualt Constructor ");
	}

	public Sum(String str) {
		System.out.println("I am a Sum Class");
	}

	public Sum(int a, int b) {
		System.out.println("Sum is : " + (a + b));
	}
	
	public Sum(double a, double b) {
		System.out.println("Sum is : " + (a + b));
	}
}
