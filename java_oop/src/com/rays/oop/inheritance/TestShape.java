package com.rays.oop.inheritance;

public class TestShape {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.setColor("Red");
		c.setBorderWidth(2);
		c.setRadius(2);

		System.out.println("Color : " + c.getColor());
		System.out.println("Radius : " + c.getRadius());
		System.out.println("Border Width : " + c.getBorderWidth());
		System.out.println("Area of Circle : " + c.area());
		System.out.println("----------------------------");

		Rectangle r = new Rectangle();
		r.setColor("Green");
		r.setBreadth(2);
		r.setLength(4);

		System.out.println("Color : " + r.getColor());
		System.out.println("Length : " + r.getLength());
		System.out.println("Breadth : " + r.getBreadth());
		System.out.println("Area of Rectangle : " + r.area());
		System.out.println("----------------------------");

		Tringle t = new Tringle();
		t.setColor("Blue");
		t.setBase(3);
		t.setHeight(5);
		
		System.out.println("Color : " + t.getColor());
		System.out.println("Base : " + t.getBase());
		System.out.println("Height : " + t.getHeight());
		System.out.println("Area of Tringle : " + t.area());
		
	}
}
