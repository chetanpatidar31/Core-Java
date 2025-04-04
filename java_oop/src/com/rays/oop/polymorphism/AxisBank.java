package com.rays.oop.polymorphism;

public class AxisBank extends Bank {
@Override
public double interestRate() {
	return 11.25;
}
@Override
	public String getName() {
		return "AxisBank";
	}
}
