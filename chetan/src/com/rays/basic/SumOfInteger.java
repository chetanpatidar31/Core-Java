package com.rays.basic;

public class SumOfInteger {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 100; i < 200; i++) {

			if (i % 7 == 0) {
				sum += i;
			}
		}
		System.out.println("Sum of all integers greater than 100 and less than 200 divisble of 7 is : " + sum);
	}
}
