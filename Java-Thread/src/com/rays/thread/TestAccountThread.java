package com.rays.thread;

public class TestAccountThread {
	public static void main(String[] args) {
		AccountThread t1 = new AccountThread("Amit");
		AccountThread t2 = new AccountThread("Nitin");
		
		t1.start();
		t2.start();
	}
	
	
}
