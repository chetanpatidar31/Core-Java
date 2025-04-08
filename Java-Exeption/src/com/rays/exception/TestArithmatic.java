package com.rays.exception;

public class TestArithmatic {
	public static void main(String[] args) {
		int a = 0;
		int b = 5;

		try {
			int c = b / a;
			System.out.println("c=" + c);
		} catch (ArithmeticException e) {
			System.out.println("exception " + e.getMessage());
		} finally {
			System.out.println("I'm Always execute");
		}
	}
}
