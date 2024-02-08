package com.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileReaderEx {

	public static void main(String[] args) throws IOException {
		
	  FileReader fr=new FileReader("a2.txt");
   BufferedReader b=new BufferedReader(fr);
  int i;
  while((i=fr.read())>0)
  {
	  System.out.println((char)i);
  }
  fr.close();
  
	}
	}

	
