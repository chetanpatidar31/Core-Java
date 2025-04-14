package com.rays.collection;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class TestEnumeration {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement("Shiv");
		v.addElement(50);
		v.addElement(6.7);

		System.out.println(v);
		Enumeration en = v.elements();

		while (en.hasMoreElements()) {
			Object o = en.nextElement();
			System.out.println(o);
		}
	}

}
