package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
	public static void main(String[] args) throws Exception {
		FileWriter fw=new FileWriter("D:/IO/test.txt");
		
		char[] aArray= {'H','i','i'};
		fw.write(aArray);
		fw.write('!');
		fw.write(' ');
		fw.write("Chetan");
		
		fw.close();
		System.out.println("insert complete");
	}
}
