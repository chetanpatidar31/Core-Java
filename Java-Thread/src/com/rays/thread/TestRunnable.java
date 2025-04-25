package com.rays.thread;

public class TestRunnable {
	public static void main(String[] args) {
		Thread t1 = new Thread(new HelloRunnable("Ram"));
		Thread t2 = new Thread(new HelloRunnable("Shayam"));
		
		t1.start();
		t2.start();
	}
}
