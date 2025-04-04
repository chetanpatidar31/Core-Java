package com.rays.oop.polymorphism;

public class HomeLoan {
	public static void main(String[] args) {
		Bank[] banks = new Bank[3];
		banks[0] = new AxisBank();
		banks[1] = new HDFCBank();
		banks[2] = new ICICIBank();
		loanEnquiry(banks);

	}

	public static void loanEnquiry(Bank[] banks) {
		for (int i = 0; i < banks.length; i++) {
			System.out.println("Bank : " + banks[i].getName());
			System.out.println("Interest Rate : " + banks[i].interestRate());

		}
	}
}
