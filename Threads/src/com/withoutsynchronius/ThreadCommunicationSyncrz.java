package com.withoutsynchronius;

public class ThreadCommunicationSyncrz {

	
		int amt=100;
		 synchronized void withdraw(int amt)
		{
			
			//System.out.println("person going to withdraw");
			if(this.amt<amt)
			{
				System.out.println("less balance  wait till deposit ");
			
			try
			{
				wait();
				Thread.sleep(2000);
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		   
		}
			this.amt=amt;
			System.out.println("persoin going to withdraw");
		}
		
		synchronized void deposit(int amt)
		{
			System.out.println("person goid to deposit");
			this.amt=amt;
			System.out.println("deposit completed ");
			notify();
		}


            public static void main(String[] args) 
            {
            	ThreadCommunicationSyncrz th =new ThreadCommunicationSyncrz();
//            	Thread t1= new Thread()
//            {
//            	public void run()
//            	{
//            		t1.withdrwa(1000);
//            	}
//           	};
//            	
//        		Thread t1=new Thread(r);
//        		t1.start();
//        		
            	Runnable r1=()->
        		{ 
            	 th.withdraw(10000);
        		};
        		Thread t=new Thread(r1);
        		t.start();
        		
          Runnable r2=()->
     { 
	 th.deposit(10000);
	  };
	Thread t2=new Thread(r2);
	t2.start();
	
}
}
