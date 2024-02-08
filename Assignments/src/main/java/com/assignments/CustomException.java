package com.assignments;

public class CustomException {

	public static void main(String[] args) 
	{
	

		
          //Student st=  new Student();
		       
		 
		        try {
		 
		          new Student().Studenfind("010");
		 
		        } catch (StudentNotFound ex)
		        {
		            System.out.println("caught exception "+ex);
		        }
		    }
			

}
