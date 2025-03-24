package com.rays.basic;

public class CharCount {
	public static void main(String[] args) {
		String str = "courseweorke";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'e') {
				count++;
			}
		}
		System.out.println("e = " + count);
	}
}
