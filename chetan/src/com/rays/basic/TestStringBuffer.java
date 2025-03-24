package com.rays.basic;

public class TestStringBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Harshit");
		System.out.println("ab is : " + sb);

		sb.append(" Patidar");
		System.out.println("after append : " + sb);

		sb.reverse();
		System.out.println("Reverse : " + sb);

		sb.delete(0, 4);
		System.out.println("Delete : " + sb);
		
		
	}
}
