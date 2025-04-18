package com.rays.io;

import java.io.File;
import java.util.Date;

public class FileInfo {
	public static void main(String[] args) {
		File f = new File("D:/IO/test.txt");
		System.out.println(f.exists());
		if (f.exists()) {
			System.out.println("can write ? : " + f.canWrite());
			System.out.println("can read ? : " + f.canRead());
			System.out.println("is File ? : " + f.isFile());
			System.out.println("is dir ? " + f.isDirectory());
			
			Date lastModified = new Date(f.lastModified());
			System.out.println("Last Modified : "+lastModified);
			System.out.println("size of file : "+f.length());
		}else {
			System.out.println("file doesn't exist");
		}
	}
}
