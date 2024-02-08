package com.assignments;
import java.util.*;


public class AddFirstElement {

	public static void main(String[] args)
	{
		 
		
		 LinkedList<String> l1=new LinkedList<String>();  
		           System.out.println("Initial lists: "+l1);  
		           l1.add("Ravi");  
		           l1.add("Vijay");  
		           l1.add("Ajay");  
		           System.out.println("After invoking: "+l1);  
		           l1.addFirst("Harhita");
		           System.out.println("after adding first elments"+l1);

	}

}
