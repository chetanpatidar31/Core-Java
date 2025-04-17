package com.rays.collection.stream;

import java.util.ArrayList;
import java.util.List;

public class TestStream {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("raju");
		list.add("babu");
		list.add("Shyam");
		list.add("tiwari");
		list.add("bandiya");
		list.add("tanmay");
		list.add("Tanmay");

		System.out.println("----List-----");
		list.forEach(System.out::println);

		System.out.println("------List in UPPERCASE---------");
		list.stream().map(e -> e.toUpperCase()).forEach(System.out::println);

		System.out.println("------List in lowercase---------");
		list.stream().map(e -> e.toLowerCase()).forEach(System.out::println);
	}
}
