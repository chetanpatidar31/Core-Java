package com.rays.io.externalization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestExternalization {
	public static void main(String[] args) throws Exception {
		Student s = new Student("Aastik", 6);

		//serializaton
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D://IO//Student.txt"));
		out.writeObject(s);
		out.close();
		System.out.println("Serialization Successfully");
		
		//Deserialization
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D://IO//Student.txt"));
		s=(Student)in.readObject();
		System.out.println(s);
		System.out.println("Deserialization Successfully");
	}
}
