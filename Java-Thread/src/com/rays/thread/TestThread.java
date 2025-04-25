package com.rays.thread;

public class TestThread {
	public static void main(String[] args) {
		HelloThread t1 = new HelloThread("Harshit");
		HelloThread t2 = new HelloThread("Nitin");
		HelloThread t3 = new HelloThread("Aastik");
		
		
		t3.setPriority(10);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
