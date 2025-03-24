package com.rays.basic;

import java.util.Scanner;

public class TestCalculator {
	public static void main(String[] args) {
		int firstNumber = 0;
		int secondNumber = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First number ");
		firstNumber = sc.nextInt();

		System.out.println("Enter second number ");
		secondNumber = sc.nextInt();

		System.out.println("first number is " + firstNumber + " Second number is " + secondNumber);

		System.out.println("Select your operation + or - or  * or /");
		String operation = "";
		operation=sc.next();

		switch (operation) {
		case "+":
			System.out.println("Result is : " + (firstNumber + secondNumber));
			break;
			
		case "-":
			System.out.println("Result is : " + (firstNumber - secondNumber));
			break;
			
		case "*":
			System.out.println("Result is : " + (firstNumber * secondNumber));
			break;
			
		case "/":
			System.out.println("Result is : " +(firstNumber / secondNumber));
			break;	
		}

	}
}
