package com.rays.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWirteBinaryFile {
	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("D:/IO/baby.jpg");
		FileOutputStream out = new FileOutputStream("D:/IO/girl.jpg");
		
		int ch = in.read();
		while(ch != -1) {
			out.write(ch);
			ch= in.read();
		}
		out.close();
		in.close();
		System.out.println("  ");
	}
}
