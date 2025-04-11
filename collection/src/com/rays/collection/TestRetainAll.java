package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestRetainAll {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();

		c1.add("GOT");
		c1.add(96);
		c1.add(9.6);
		c1.add('c');
		c1.add(true);
		c1.add("GOT");
		
		System.out.println("c1 : "+c1);
		System.out.println("c1 Size : "+c1.size());
		
		System.out.println("-------------------");
		
		Collection c2=new ArrayList();
		c2.add("SunBurn");
		c2.add(45);
		c2.add(4.5);
		c2.add('c');
		c2.add(false);
		System.out.println("c2 : " + c2);
		System.out.println("c2 Size : "+c2.size());
		
//		retain method: delete all element except common element from both collection array
		System.out.println("before retain : "+c1);
		System.out.println("retain : "+c1.retainAll(c2));
		System.out.println("after retain : "+c1);
		
		
	}

}
