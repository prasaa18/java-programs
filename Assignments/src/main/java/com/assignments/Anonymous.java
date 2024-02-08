package com.assignments;


//@FunctionalInterface
  public interface Anonymous
  {
    public void data(int n);
    public void show();
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
	   
	   Anonymous an= new Anonymous()
	   {
		  @Override 
		  public void data(int n)
		  {
			  System.out.println("hi "+6);
		  }
		  @Override
		  public void show()
		  {
			  System.out.println("hlw");
		  }
	   };
	   an.data(6);
	   an.show();
	   Anonymous.run();
	   an.display();
	   
	   
	 /*  Anonymous an=(n)->
	   {
		  System.out.println(" na "+n); 
	   };
	   an.data(6);
	   */
    }
}