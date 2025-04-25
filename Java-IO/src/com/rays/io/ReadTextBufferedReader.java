package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextBufferedReader {
	public static void main(String[] args) throws IOException {
		FileReader source = new FileReader("D:/IO/test.txt");
		BufferedReader br = new BufferedReader(source);

		String data = br.readLine();

		while (data != null) {
			System.out.println(data);
			data = br.readLine();
		}
		br.close();
	}
}
