
package com.rays.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class AgeCalc {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		AgeCalc p = new AgeCalc();

		p.setName("Chetan");
		String name = p.getName();
		p.setDob(sdf.parse("2001-04-23"));
		int age = p.ageFind(p.getDob());

		System.out.println(name + " = " + age);

	}

	private String name;
	private Date dob;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static int ageFind(Date dob) {
		if (dob == null) {
			throw new IllegalArgumentException("Date of birth cannot be null");
		}

		LocalDate birthDate = dob.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate currentDate = LocalDate.now();

		int yourAge = Period.between(birthDate, currentDate).getYears();

		return yourAge;
	}

}
