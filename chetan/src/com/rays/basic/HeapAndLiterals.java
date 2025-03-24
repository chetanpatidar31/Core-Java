package com.rays.basic;

public class HeapAndLiterals {
	public static void main(String[] args) {

		String s1 = "Welcome";
		String s2 = "Welcome";
		String s3 = new String("Welcome");
		String s4 = new String("Welcome");

		System.out.println("Use equals() method : " + s1.equals(s3));
		System.out.println( s2 == s1);

	}
}
