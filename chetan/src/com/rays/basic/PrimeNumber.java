package com.rays.basic;

public class PrimeNumber {
	public static void main(String[] args) {
		int a = 21;
		int count = 0;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println(a + " is Prime Number");
		} else {
			System.out.println(a + " is Non-Prime Number");
		}

	}
}
