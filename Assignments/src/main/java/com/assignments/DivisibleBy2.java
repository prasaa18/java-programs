package com.assignments;



import java.util.Scanner;

public class DivisibleBy2 {

	public static void main(String[] args) {
		
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Enter an integer number:");
			 int num = sc.nextInt();
			 
			  
			if(num % 2 == 0)
			{
			  System.out.println(num +" is divisibe by 2");
			}
			 
			else if(num % 2 != 0)
			{
			  System.out.println(num + " is not divisible by 2");
			 
			}
		
	}

}
