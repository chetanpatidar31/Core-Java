package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestFailFast {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Harshu");
		list.add(87);
		list.add(3.3);

		System.out.println(list);
//		fail fast
		Iterator it = list.iterator();
//		list.add("levi");
		
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
	}
}
