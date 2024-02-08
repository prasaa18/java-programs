package com.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) {
		try
		{
		    File f1=new File("a2.txt");
		    String s="java is objectorieneted programing language";
			FileWriter fr=new FileWriter(f1);
			fr.write(s);
		    fr.close();
		    
		     
		     System.out.println("sucess");
		  
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
