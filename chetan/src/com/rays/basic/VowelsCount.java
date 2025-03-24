package com.rays.basic;

public class VowelsCount {
	public static void main(String[] args) {
		String str = "Think beyond";
		String str1 = str.toLowerCase();
		int count = 0;

		for (int i = str1.length() - 1; i >= 0; i--) {
			char ch = str1.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}

		}
		System.out.println("count value " + count);
	}
}
