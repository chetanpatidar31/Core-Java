package com.rays.oop.encapsulation;

public class SumTestConstructor {
	public static void main(String[] args) {
		Sum s = new Sum();

		Sum s1 = new Sum("Hello");

		Sum s2 = new Sum(45, 15);

		Sum s3 = new Sum(23.35, 74.12);
	}
}
