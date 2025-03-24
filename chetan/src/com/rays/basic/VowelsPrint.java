package com.rays.basic;

public class VowelsPrint {
	public static void main(String[] args) {
		String str="google";
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.print(ch);
			}
		}
	}

}
