package com.rays.basic;

public class ReverseNumber {
	public static void main(String[] args) {
		int i = 8740;
		int temp = i;
		int r = 0;
		int rnum = 0;

		while (temp > 0) {
			r = temp % 10;
			rnum = rnum * 10 + r;
			temp = temp / 10;
		}
		System.out.println("Reverse of " + i + " is " + rnum);
	}
}
