package com.rays.collection.list;

import java.util.Vector;

public class TestVector {
	public static void main(String[] args) {
		Vector v = new Vector();

		v.addElement("Ram");
		v.addElement(89);
		v.addElement(7.6);

		System.out.println("Vector : " + v);
		System.out.println("Size : " + v.size());
	}
}
