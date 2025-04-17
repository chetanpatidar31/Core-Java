package com.rays.collection.comparator;

public class Marksheet {
	public int rollNo;
	public String name;
	public int physics;

	public Marksheet(int rollNo, String name, int physics) {
		this.rollNo = rollNo;
		this.name = name;
		this.physics = physics;
	}

	@Override
	public String toString() {
		return "rollNo: " + rollNo + ", name: " + name + ", physics: " + physics;
	}
}
