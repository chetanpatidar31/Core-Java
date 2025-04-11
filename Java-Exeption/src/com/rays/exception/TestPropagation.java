package com.rays.exception;

public class TestPropagation {
	public static void main(String[] args) throws ChekedException {
		System.out.println("main() method");
		dad();
	}
	
	public static void dad() throws ChekedException {
		System.out.println("dad() method");
//		mom();
		try {
			mom();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("after dad call mom");
	}
	
	public static void mom() throws ChekedException {
		System.out.println("mom() method");
		son();
		System.out.println("after mom call son");
		
	}
	
	public static void son() throws ChekedException {
		System.out.println("son() method");
		throw new ChekedException("Make a mistake");
	}
}
