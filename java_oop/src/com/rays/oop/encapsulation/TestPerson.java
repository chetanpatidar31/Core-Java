package com.rays.oop.encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Person p = new Person();

		p.setName("Chetan");
		System.out.println("Name is : " + p.getName());

		p.setAddress("Indore");
		System.out.println("Address is : " + p.getAddress());

		p.setDob(sdf.parse("2001-04-23"));
		System.out.println("DOB is : " + sdf.format(p.getDob()));
	}
}
