package com.rays.collection.set;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		Set s = new HashSet();
		
		s.add('c');
		s.add(67);
		s.add("chetan");
		s.add(19);
		s.add('a');
		s.add("shiv");
		s.add(null);
		s.add(11);
		
		System.out.println("Set : "+s);
		System.out.println("Size of set : "+s.size());
	}
}
