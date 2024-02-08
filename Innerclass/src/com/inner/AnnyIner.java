package com.inner;

//@FunctionalInterface
  public interface AnnyIner
  {
    public void data(int n);
   // public void show();
    default void display()
    {
    	System.out.println("display default mrthod");
    }
    static void run()
    {
    	System.out.println("static method");
    }
	
   public static void main(String[] args)
    {
	   
	   /*AnnyIner an= new AnnyIner()
	   {
		  @Override 
		  public void data(int n)
		  {
			  System.out.println("hi"+n);
		  }
		  @Override
		  public void show()
		  {
			  System.out.println("hlw");
		  }
	   };
	   an.data(6);
	   an.show();
	   AnnyIner.run();
	   an.display();*/
	   
	   
	   AnnyIner an=(n)->
	   {
		  System.out.println("na "+n); 
	   };
	   an.data(6);
    }
}