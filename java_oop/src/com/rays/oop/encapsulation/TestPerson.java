package com.rays.oop.encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Person p = new Person();

		p.setName("Chetan");
		System.out.println("Name : " + p.getName());

		p.setAddress("Indore");
		System.out.println("Address : " + p.getAddress());

		p.setDob(sdf.parse("2001-04-23"));
		System.out.println("DOB : " + sdf.format(p.getDob()));

		System.out.println("---------------------");

		Person p1 = new Person();

		p1.setName("CA Harshit Patidar");
		System.out.println("Name : " + p1.getName());

		p1.setAddress("Semarada");
		System.out.println("Address : " + p1.getAddress());

		p1.setDob(sdf.parse("2008-11-15"));
		System.out.println("DOB : " + sdf.format(p1.getDob()));

		int age = Person.getAge(sdf.parse(sdf.format(p1.getDob())));
		if (age < Person.AVG_AGE) {
			System.out.println(p1.getName() + " you are not eligible for vote bcz your age is " + age);
		} else {
			System.out.println(p1.getName() + " you are eligible for vote bcz your age is " + age);
		}

	}
}
