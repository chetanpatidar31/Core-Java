package com.rays.collection.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamPrimeNo {
	public static boolean isPrime(int x) {
		int count = 0;

		if (x == 1) {
			return false;
		}

		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				count++;
			}
		}
		return count == 0;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(13);
		list.add(14);
		
		list.stream().distinct().filter(c-> isPrime(c)).forEach(System.out::println);
	}
}
