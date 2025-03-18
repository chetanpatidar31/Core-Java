package com.rays.basic;

public class Swap {
	public static void main(String[] args) {
		int a = 3;
		int b = 8;
		int c;

		System.out.println("Before Swap");
		System.out.println("a is " + a);
		System.out.println("b is " + b);

		c = a;
		a = b;
		b = c;

		System.out.println("After Swap");
		System.out.println("a"
				+ " is " + a);
		System.out.println("b is " + b);

	}
}
