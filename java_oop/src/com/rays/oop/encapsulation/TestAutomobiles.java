package com.rays.oop.encapsulation;

import java.util.Scanner;

public class TestAutomobiles {
	public static void main(String[] args) {
		Automobiles am = new Automobiles();

		am.setColor("Red");
		System.out.println("Color of car : " + am.getColor());

		am.setSpeed(200);
		System.out.println("Car speed : " + am.getSpeed() + "km/h");
		
		am.setMake("bmw");
		System.out.println("Maker of car is : "+am.getMake());
		
		am.carBreak();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the car gear");
		String gear= sc.next();
		am.gear(gear);
		sc.close();

	}
}
