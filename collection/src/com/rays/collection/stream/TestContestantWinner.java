package com.rays.collection.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestantWinner {
	public static void main(String[] args) {
		List<Contestant> list = new ArrayList<Contestant>();

		list.add(new Contestant("9755193446", "Gopal"));
		list.add(new Contestant("9109652966", "Harshit"));
		list.add(new Contestant("8398592598", "Aastik"));
		list.add(new Contestant("7023672367", "Tanish"));
		list.add(new Contestant("9660021188", "Nitin"));
		list.add(new Contestant("9849482829", "Shiv"));
		list.add(new Contestant("83985925", "Aastik"));
		list.add(new Contestant("9856515475", "Chetan"));
		list.add(new Contestant("8985878546", "Shubham"));
		list.add(new Contestant("8985878546", "Shubham"));

		// get phone no
		System.out.println("phone: ------------");
		list.stream().map(e -> e.phoneNo).forEach(System.out::println);

		// remove duplicate entry
		System.out.println("remove duplicate: ------------");
		list.stream().map(e -> e.name).distinct().forEach(System.out::println);

		// validate phone no.
		System.out.println("validate phone no.: ------------");
		list.stream().map(e -> e.phoneNo).distinct().filter(e -> e.length() == 10).forEach(System.out::println);

		// shuffle phone no.
		System.out.println("shuffle phone no: ------------");
		list.stream().map(e -> e.phoneNo).distinct().filter(e -> e.length() == 10)
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).forEach(System.out::println);

		// get 3 winner
		System.out.println("get 3 winne by nor----");
		list.stream().map(e -> e.phoneNo).filter(e -> e.length() == 10).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).limit(3).forEach(System.out::println);

		System.out.println("get 3 winner by name");
		list.stream().map(e -> e.name).distinct().collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
			Collections.shuffle(e);
			return e.stream();
		})).limit(3).forEach(System.out::println);;
	}
}
