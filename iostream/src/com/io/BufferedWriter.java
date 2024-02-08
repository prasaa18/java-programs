package com.io;

import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter {


	public BufferedWriter(FileWriter fr) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException 
	{

		  FileWriter fr=new FileWriter("a2.txt");
		   BufferedWriter b=new BufferedWriter(fr);
           fr.write(" wjw");
          
           fr.close();
           
       
       
    
       

	}

}
