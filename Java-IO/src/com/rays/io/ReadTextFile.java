package com.rays.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("D:/IO/test.txt");

		int i = fr.read();

		while (i != -1) {
			System.out.print((char) i + "");

			i = fr.read();
		}
//		fr.close();
	}
}
