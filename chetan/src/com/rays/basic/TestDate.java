package com.rays.basic;

import java.util.Date;
import java.text.SimpleDateFormat;

public class TestDate {
	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);
		SimpleDateFormat sdf=new SimpleDateFormat();
		
		System.out.println(sdf.format(date));
		
	}
}
