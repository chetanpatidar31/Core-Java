package com.rays.basic;

public class Pelindrome {
	public static void main(String[] args) {
		int i = 87378;
		int temp = i;
		int r = 0;
		int rnum = 0;

		while (temp > 0) {
			r = temp % 10;
			rnum = rnum * 10 + r;
			temp = temp / 10;
		}
		if (i == rnum) {
			System.out.println(i + " is Pelindrome");
		} else {
			System.out.println(i + " is not Pelindrome");
		}
	}
}
