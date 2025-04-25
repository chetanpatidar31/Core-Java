package com.rays.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputAndOutputStream {
	public static void main(String[] args) throws IOException {
		BufferedInputStream in =new BufferedInputStream(new FileInputStream("D:/IO/baby.jpg"));
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("d:/IO/child.jpg"));
		
		byte[] buff=new byte[256];
		int count=in.read(buff);
		System.out.println("count : "+count);
		while(count > 1) {
			out.write(buff,0,count);
			count=in.read(buff);
		}
		out.close();
		in.close();
		System.out.println("success");
	}
}
