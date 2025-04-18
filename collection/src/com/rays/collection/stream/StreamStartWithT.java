package com.rays.collection.stream;

import java.util.Arrays;
import java.util.List;

public class StreamStartWithT {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Tanish","shivam","tannu","tarun","rahul");
		
		list.stream().map(e-> e.toUpperCase()).filter(e-> e.startsWith("T")).distinct().forEach(System.out::println);
	}
}
