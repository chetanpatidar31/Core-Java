package com.rays.exception;

public class TMKOCPropagation {
	public static void main(String[] args) {
		jethalal();
	}

	public static void jethalal() {
		try {
			daya();
		}catch(RuntimeException e) {
			System.out.println("Tappu's mistake handled by Jethalal");
		}
	}
	
	public static void daya() {
		tappu();
	}
	
	public static void tappu() {
		RuntimeException e=new RuntimeException("I made a mistake");
		throw e;
		
	}
}
