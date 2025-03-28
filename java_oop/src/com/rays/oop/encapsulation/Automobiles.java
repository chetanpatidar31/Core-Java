package com.rays.oop.encapsulation;

public class Automobiles {
	private String color;
	private int speed;
	private String make;

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return this.speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getMake() {
		return this.make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	
	public void carBreak() {
		System.out.println("Car is Stop");
	}
	
	public void gear(String gear) {
		switch (gear) {
		case "1":
			System.out.println("car speed is below 20 in "+gear+" gear");
			break;

		case "2":
			System.out.println("car speed is between 20-40 in "+gear+" gear");
			break;

		case "3":
			System.out.println("car speed is between 40-60 in "+gear+" gear");
			break;

		case "4":
			System.out.println("car speed is between 80-100 in "+gear+" gear");
			break;

		case "5":
			System.out.println("car speed is between 100-120 in " +gear+" gear");
			break;

		
		default:
			System.out.println("Car is in reverse gear");
		}
	}

}
