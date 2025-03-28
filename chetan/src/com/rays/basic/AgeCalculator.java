package com.rays.basic;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
	public static void main(String[] args) {
		LocalDate local = LocalDate.now();
		System.out.println("local time is : " + local);

		LocalDate myDob = LocalDate.of(1998, 02, 03);
		System.out.println("dob is : " + myDob);

		Period bet = Period.between(myDob, local);
		System.out.println("Your age is : " + bet.getYears());
	}
}
