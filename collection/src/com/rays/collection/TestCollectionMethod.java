package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionMethod {
	public static void main(String[] args) {
		Collection c = new ArrayList();

		c.add("GOT");
		c.add(96);
		c.add(9.6);
		c.add('c');
		c.add(true);
		c.add("GOT");

		System.out.println("c : " + c);

		System.out.println("Size : " + c.size());
		
		Collection c2=new ArrayList();
		c2.add("SunBurn");
		c2.add(45);
		c2.add(4.5);
		c2.add('p');
		c2.add(false);
		System.out.println("c2 : " + c2);
		
		c.addAll(c2);
		
		System.out.println("contains : " + c.contains("GOT"));
		System.out.println("ContainsAll :"+c.containsAll(c2));
		
		System.out.println("remove : "+c.remove("GOT"));
		System.out.println("c : " + c);
		
		System.out.println("removeAll : "+c.removeAll(c2));
		System.out.println("c : " + c);
		
		c.clear();
		System.out.println("isEmpty : "+c.isEmpty());
		
		
		
		
		
	}
}
