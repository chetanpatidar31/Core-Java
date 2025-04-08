package com.rays.exception;

public class TestAccount {
	public static void main(String[] args) throws InsufficentFundException {
		double balance = 2000;
		double withdrawal = 2120;

		if (balance < withdrawal) {
			throw new InsufficentFundException("Insufficent fund transfer");
		} else {
			balance = balance - withdrawal;
			System.out.println("Balance is " + balance);
		}
	}
}
