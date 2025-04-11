package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {
		Collection c = new ArrayList();

		c.add("GOT");
		c.add(96);
		c.add(9.6);
		c.add('c');
		c.add(true);
		c.add("GOT");
		
		System.out.println("Collection : " + c);
		
		System.out.println("Size : "+c.size());
		
		System.out.println("-----for loop----");
		for (Object b : c) {
			System.out.println(b);
		}
		
		
		

	}

}
