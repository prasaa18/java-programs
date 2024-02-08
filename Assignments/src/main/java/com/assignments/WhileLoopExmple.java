package com.assignments;



import java.util.Scanner;

public class WhileLoopExmple {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
	int temp= sc.nextInt();
	
	int rem=0, r;
	int n=temp;
	  while(temp!=0)
	   {
		r= temp%10;
		rem=rem*10+r;  
		temp=temp/10;
		System.out.println(" last digit are "+r);
	   }
          if( rem==n)
       {
	      System.out.println("palindrome");
       }
    else
      {
	     System.out.println("not palindrome");
      }
  }

}
