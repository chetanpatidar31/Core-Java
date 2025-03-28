package com.rays.oop.encapsulation;

public class Account {
	private String number;
	private String accountType;
	private double balance;

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAccountType() {
		return this.accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amt) {
		this.balance = this.balance + amt;
		System.out.println("Balance after deposit : " + this.balance);
	}

	public void withdrawal(double amt) {
		if (amt > this.balance) {
			System.err.println("Insufficent Balance");
		} else {
			this.balance = this.balance - amt;
			System.out.println("Balance after Withdrawal : " + this.balance);
		}
	}
	
	public void fundTransfer(double amt) {
		if (amt > this.balance) {
			System.err.println("Insufficent Balance");
		} else {
			this.balance = this.balance - amt;
			System.out.println("Balance after Fund Transfer : " + this.balance);
		}
	}
	
	public void payBill(double amt) {
		if (amt > this.balance) {
			System.err.println("Insufficent Balance");
		} else {
			this.balance = this.balance - amt;
			System.out.println("Balance after pay bills : " + this.balance);
		}
	}
}
