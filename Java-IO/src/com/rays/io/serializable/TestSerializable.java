package com.rays.io.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerializable {
	public static void main(String[] args) throws Exception {
		Employee e = new Employee("Nitin", 5);
		// serialization
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D://IO//Employee.txt"));
		out.writeObject(e);
		out.close();
		System.out.println("Serialization Successfully");

		// deserialization
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D://IO//Employee.txt"));
		e = (Employee)in.readObject();
		System.out.println(e);
		in.close();
		System.out.println("Deserialization Successfully");
		
	}
}
