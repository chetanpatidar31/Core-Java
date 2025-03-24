package com.rays.basic;

public class LargestElement {
	public void largest(int[] arr) {
		int max = 0;

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Largest Element is : " + max);
	}

	public static void main(String[] args) {
		LargestElement max = new LargestElement();
		int[] arr = { 54, 43, 65, 23, 93, 74 };
		max.largest(arr);
	}
}
