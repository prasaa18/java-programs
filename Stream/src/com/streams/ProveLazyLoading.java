package com.streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class ProveLazyLoading 
{
    public  static boolean isDivisible(int i) 
    {
    	System.out.println("in divi"+i);
    	 return i%5==0;
    	 
    	
    }
    public  static int mapDouble(int i) 
    {
    	System.out.println("in divi"+i);
    	 return i*2;
    	 
    	
    }
    
	public static void main(String[] args) 
	{
		  List<Integer> n=Arrays.asList(5,6,7,8,10);
		  System.out.println(n.stream().filter(ProveLazyLoading ::isDivisible).map(ProveLazyLoading :: mapDouble).findAny().orElse(0));
	     
	}

}
