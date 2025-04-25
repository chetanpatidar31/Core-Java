package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ValidEmail {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("D:/IO/email.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:/IO/valid_email.txt"));

		String email;

		while ((email = br.readLine()) != null) {

			if (email.endsWith("@gmail.com")) {
				System.out.println(email);
				bw.write(email);
				bw.newLine();
				email = br.readLine();
			}
		}
		br.close();
		bw.close();
	}
}
