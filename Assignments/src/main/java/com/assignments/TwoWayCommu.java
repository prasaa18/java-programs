package com.assignments;

public class TwoWayCommu {
   
	public void greetingsA(  boolean m) 
	{
		if(m==false)
		{
			try {
			
		        System.out.println("He may be Unkonwn person");
		        wait();
	       }
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
		System.out.println("hi raj");
		
		
		}

	public void greetingsB( boolean m) 
	{
	System.out.println("hi dq");

	notify();
	}

	public static void main(String[] args) 
	{
		 TwoWayCommu th=new TwoWayCommu();
           

       	Runnable r1=()->
   		{ 
       	 th.greetingsA( false);
   		};
   		Thread t=new Thread(r1);
   		t.start();
   		
     Runnable r2=()->
         { 
               th.greetingsB(true);
             };
          Thread t2=new Thread(r2);
         t2.start();
	}

}
