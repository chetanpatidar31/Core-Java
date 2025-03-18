package com.rays.basic;

public class TestString {
	public static void main(String[] args) {
		String name = "Vijay Dinanath Chouhan";

		System.out.println("Length of String : " + name.length());
		System.out.println("Character at index : " + name.charAt(7));
		System.out.println("Index of char : " + name.indexOf("D"));
		System.out.println("Last Index of Char : " + name.lastIndexOf("a"));
		System.out.println("Substring of name : " + name.substring(6));
		System.out.println("Convert in LowerCase : " + name.toLowerCase());
		System.out.println("Convert in UpperCase : " + name.toUpperCase());
		System.out.println("Starts with : " + name.startsWith("vij"));
		System.out.println("Ends with : " + name.endsWith("uhan"));
		System.out.println("Replace Vijay with Ajay : " + name.replace("Vijay", "Ajay"));
	}
}
