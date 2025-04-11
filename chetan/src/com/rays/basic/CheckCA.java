package com.rays.basic;

public class CheckCA {
	
	public static void CAPost(boolean foundation,boolean inter,boolean CAFinal) {
		if (foundation && inter && CAFinal) {
			System.out.println("Congrats! You are CA Harshit Patidar");
		} else if (foundation && inter) {
			System.out.println("You are Half CA Harshit Patidar");
		} else {
			System.out.println("You are just Harshit Patidar");
		}
	}
	
}
