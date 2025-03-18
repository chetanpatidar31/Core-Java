package com.rays.basic;

public class TestArray {
	public static void main(String[] args) {
		int[] i = { 3, 6, 9, 12 };

		System.out.println("Length of array  : " + i.length);
		System.out.println(i[2]);
		System.out.println("-----For each Loop-----");

		for (int a : i) {
			System.out.println(a);
		}
	}
}
