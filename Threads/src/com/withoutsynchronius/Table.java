package com.withoutsynchronius;

public class Table {
	
	void printTable(int n)
	{
		for(int i=1;i<=5;i++)
	    {
		System.out.println(n*i);
		try
		{
			Thread.sleep(2000);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	   }
	
	}
	public static void main(String[] args)throws InterruptedException
	{
	     Table th=new Table();
	     Thread t1=new Thread()
		 {
	    	public void run()
	    	{
	    		th.printTable(5);
	    	}
	    	 
	     };
	     t1.start();
	     
	}

}
