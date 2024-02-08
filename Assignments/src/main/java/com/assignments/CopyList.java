package com.assignments;
import java.util.*;
public class CopyList {

	public static void main(String[] args)
	{
		 
		      LinkedList<String> l1=new LinkedList<String>();  
		           System.out.println("Initial lists"+l1);  
		           l1.add("Ra");  
		           l1.add("pra");  
		           l1.add("haq");  
		           l1.add(1, "jas");  
		           System.out.println("After invoking  "+l1);  
		           LinkedList<String> l2=new LinkedList<String>();  
		           l2.add("maq");  
		           l2.add("Har");  
		          
			        l1.addAll(l2);  
				  System.out.println(l1);
	}

}
