package com.assignments;

interface I1
{
  public void show();
  default  int display(int n)
  {
	return n;
	  
  }
  static void view()
  {
	  System.out.println("this is view method ");
	  
  }
  
  
}
interface I2
{
	public void run();
	
}

public class InteraceDemo
{

    public void Try()


    {
	 class InteraceDemo1 implements I1
	  {
		 
		@Override
	    public void show()
	    {
		  System.out.println("this is override  show method");
	     }
	 }
	   InteraceDemo1 i1=new  InteraceDemo1();
	   i1.show();
	     int ob=i1.display(7);
	     System.out.println(ob);
	  }
			 
   
	 

	public static void main(String[] args)
	{
	
	
		I2 i= new I2()
		{
		   @Override
		   public void run() {
			  
			   System.out.println("this is run method ");
		   }
		 
		};
		 i.run();
		 InteraceDemo in=new  InteraceDemo();
		 in.Try();
		 I1.view();
		 
		
	}
}
		
