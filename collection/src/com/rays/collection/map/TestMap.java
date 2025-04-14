package com.rays.collection.map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	public static void main(String[] args) {
		Map m = new HashMap();
		
		m.put("one", 5);
		m.put("two", 7);
		m.put("three",4);
		
		System.out.println("Map : "+m);
		
		System.out.println(m.get("two"));
		System.out.println(m.containsKey("one"));
		System.out.println(m.containsValue(4));
		System.out.println(m.entrySet());
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.size());
	}
}
