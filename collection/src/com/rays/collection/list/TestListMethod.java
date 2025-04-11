package com.rays.collection.list;

import java.util.ArrayList;
import java.util.List;

public class TestListMethod {
	public static void main(String[] args) {
		List list = new ArrayList();

		list.add(0, "Amit");
		list.add(1, 18);
		list.add(2, 1.8);
		list.add(3, null);
		list.add(4, 90);
		list.add(5, 'd');
		list.add(6, "Amit");

		System.out.println("list : " + list);
		list.add(5, "rahul");

		System.out.println("list : " + list);
		System.out.println("size of list : " + list.size());
		System.out.println("8th value of list: " + list.get(7));
		list.remove(3);
		System.out.println("list : "+list);
		System.out.println("index of : "+list.indexOf("Amit"));
		System.out.println("lastIndex of : "+list.lastIndexOf("Amit"));
		System.out.println("sub list : "+list.subList(1, 5));
		
	}
}
