package com.rays.basic;

public class MaxNumber {
	public static void main(String[] args) {
		int a = 45;
		int b = 18;

		if (a > b) {
			System.out.println(a + " is max no.");
		} else {
			System.out.println(b + " is min no.");
		}
		System.out.println("max ix : "+Math.max(a, b));
	}
}
