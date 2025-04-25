package com.rays.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWritePrimitive {
	public static void main(String[] args) throws IOException {
		DataOutputStream out =new DataOutputStream(new FileOutputStream("D:/binary.dat"));
		
		out.writeInt(1);
		out.writeBoolean(true);
		out.writeChar('a');
		out.writeDouble(30.55);
		out.close();
		
		DataInputStream in =new DataInputStream(new FileInputStream("D:/binary.dat"));
		System.out.println(in.readInt());
		System.out.println(in.readBoolean());
		System.out.println(in.readChar());
		System.out.println(in.readDouble());
		in.close();
	}
}
