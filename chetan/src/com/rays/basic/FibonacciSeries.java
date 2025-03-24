package com.rays.basic;

public class FibonacciSeries {
	public static void main(String[] args) {
		int num = 10;
		int num1 = 0, num2 = 1, num3;

		for (int i = 1; i <= num; i++) {
			System.out.print(num1 + " ");

			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
		}
	}
	
}
