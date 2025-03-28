package com.rays.oop.encapsulation;

public class TestAccount {
	public static void main(String[] args) {
		Account ac = new Account();

		ac.setNumber("13000987789");
		System.out.println("Account Number : " + ac.getNumber());

		ac.setAccountType("Saving");
		System.out.println("Account type : " + ac.getAccountType());

		ac.setBalance(10000.45);
		System.out.println("Balance : " + ac.getBalance());

		ac.deposit(3500.34);
		
		ac.withdrawal(7000.22);
		
		ac.fundTransfer(500);
		
		ac.payBill(300);
	}
}
