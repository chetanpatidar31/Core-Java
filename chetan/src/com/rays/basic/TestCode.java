package com.rays.basic;

import java.util.Random;

public class TestCode {
	public static void main(String[] args) {

		int[] arr = { 20, 10, 11, 5,87, 13, 67, 86 };

		int secondHighest = 0;

		int highest = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > highest) {

//				secondHighest = highest;

				highest = arr[i];

			}

			if (arr[i] < highest && arr[i] > secondHighest) {
				secondHighest = arr[i];
			}
		}
		System.out.println("Highest: " + highest);

		System.out.println("Second Highest: " + secondHighest);
	}
}
