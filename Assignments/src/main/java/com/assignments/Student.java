package com.assignments;

public class Student {

			 
		    public void Studenfind(String studentid) throws StudentNotFound { 
		    		//throws StudentNotFound{
		        if (studentid.equals("123456")) {
		        	System.out.println("student id found");
		        }
		        else
		        {
		        	throw new StudentNotFound("exception occured");
		        	
		        }
		    }
	

}
