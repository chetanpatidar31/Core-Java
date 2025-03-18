package com.rays.basic;

public class StringArray {
	public static void main(String[] args) {
		String[] str = { "Aastik", "Amit", "Anwar", "Chetan" };

		System.out.println(str[3]);
		System.out.println("Length of String array  : " + str.length);

		for (String s : str) {
			System.out.println(s);
		}

	}
}
