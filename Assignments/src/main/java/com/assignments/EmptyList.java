package com.assignments;
import java.util.*;
public class EmptyList {

	public static void main(String[] args) 
	{

		  ArrayList<String> list=new ArrayList<String>(); 
		  
		 System.out.println( list.isEmpty());// to chjeck list is Empty or Not
		  list.add("mm");
		  list.add("aa");    
		  list.add("bb");    
		  list.add("cc");    
		  
		 
		  Iterator itr=list.iterator(); 
		  while(itr.hasNext())
		  {  
		   System.out.println(itr.next());
		  }  
		  list.remove(1);  // remove element at specified postion at index 1
		  System.out.println(list);
		  
		  System.out.println(list.isEmpty());
		  
		 } 
}
