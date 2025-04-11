package com.rays.collection.list;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		List list=new ArrayList();
		
		list.add("Amit");
		list.add(18);
		list.add(1.8);
		list.add(null);
		list.add(null);
		list.add('d');
		list.add("ram");
		
		System.out.println("list : "+list);
		System.out.println("size of list : "+list.size());
		
	}
}
