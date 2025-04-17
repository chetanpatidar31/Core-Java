package com.rays.collection.comparable;

public class Marksheet implements Comparable<Marksheet>{
	private int rollNo;
	private String name;
	private int physics;

	public Marksheet(int rollNo, String name, int physics) {
		this.rollNo = rollNo;
		this.name = name;
		this.physics = physics;
	}

	@Override
	public String toString() {
		return "rollNo=" + rollNo + ", name=" + name + ", physics=" + physics;
	}

	@Override
	public int compareTo(Marksheet o) {
		return this.physics - o.physics;
	}
	
	

}
