package com.lambdaEx;

public class WithLambda {

	public static void main(String[] args) {
		Runnable r1=()->
		{
			for(int i=0; i<=5; i++)
			{
				System.out.println("hi");
				try
				{
					Thread.sleep(2000);
					
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			   
			}
			
		};
		Thread t1=new Thread(r1);
		t1.start();
		
		
	}

}
