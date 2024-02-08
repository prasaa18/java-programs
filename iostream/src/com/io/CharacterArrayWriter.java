package com.io;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterArrayWriter {

	public static void main(String[] args) throws IOException 
	{
		CharArrayWriter out=new CharArrayWriter();
		
		FileWriter f1=new FileWriter("a3.txt");
		FileWriter f2=new FileWriter("a4.txt");
		FileWriter f3=new FileWriter("a2.txt");
		
		out.write("welcome");
		

		out.writeTo(f1);
		out.writeTo(f2);
		
		out.writeTo(f3);
		f1.close();
		f2.close();
		f3.close();
		System.out.println("sucesss");

}
}
