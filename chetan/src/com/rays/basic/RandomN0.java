package com.rays.basic;

public class RandomN0 {
	public static void main(String[] args) {
		System.out.println("Random Integer b/w 1 to 100");

		for (int i = 1; i <= 5; i++) {

			double d = Math.random() * 100;
			int a = (int) d;
			System.out.println(a);
		}
	}
}
