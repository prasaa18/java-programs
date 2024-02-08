package com.assignments;

import java.util.Scanner;
public class MulipleOfNumbeer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=1; i<=10; i++)
		{
			System.out.println("multiple Of " +n+"*"+i +" ="+ (i*n));
		}
	}

}
