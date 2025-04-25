package com.rays.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite {
	public static void main(String[] args) throws IOException {
		File f = new File("D:/IO/test.txt");
//		System.out.println(f.exists());

		FileWriter fw = new FileWriter("D:/IO/test.txt", true);

		fw.write(". This is read and write file");

		fw.close();

		FileReader fr = new FileReader("D:/IO/test.txt");

		int i = fr.read();

		while (i != -1) {
			System.out.print((char) i + "");

			i = fr.read();
		}
		fr.close();
	}
}
