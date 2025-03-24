package com.rays.basic;

public class SecondLargestElement {
	public void secondLargest(int[] arr) {
		int highest = 0;
		int secondHighest = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > highest) {
				secondHighest = highest;
				highest = arr[i];
			}

			if (arr[i] < highest && arr[i] > secondHighest) {
				secondHighest = arr[i];
			}

		}
		System.out.println("Largest  : "+highest);
		System.out.println("Second Largest : "+secondHighest);

	}

	public static void main(String[] args) {
		SecondLargestElement second = new SecondLargestElement();
		int[] arr= {20,10,11,5,97,13,67,86};
		second.secondLargest(arr);
		
	}

}
