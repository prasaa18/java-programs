package com.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamEx {

	public static void main(String[] args)
	{
		try 
		{
			FileOutputStream fout =new FileOutputStream("a2.txt");
			BufferedOutputStream bout =new BufferedOutputStream(fout);
			String s= "welcome to j";
			byte b[]=s.getBytes();
			bout.write(b);
			bout.flush();
			fout.close();
			System.out.println("sucess");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
