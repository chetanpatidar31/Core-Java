package com.rays.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextBufferedWriter {
	public static void main(String[] args) throws IOException {
		FileWriter target = new FileWriter("D:/IO/rays.txt",true);
		BufferedWriter out = new BufferedWriter(target);
		
		out.write("Hello Guyzz..");
		System.out.println("Inserted");
		out.close();
	}
}
