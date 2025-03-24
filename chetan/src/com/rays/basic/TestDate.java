package com.rays.basic;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestDate {
	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(date));

		System.out.println("---------------------");
		String dob = "14/03/2001";
		Date mydob = sdf.parse(dob);
		System.out.println("My dob : " + mydob);

	}
}
