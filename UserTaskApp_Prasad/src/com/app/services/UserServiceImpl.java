package com.app.services;

import java.util.Scanner;

import com.app.database.UserDatabase;
import com.app.entities.User;

public  class UserServiceImpl implements UserService {
  
	 
	  Scanner sc1=new Scanner(System.in);
	  UserDatabase usDB=new UserDatabase();
	  User u1=new User();
	@Override
	public void signup()
	{
		System.out.println(" user signup started ");
		
		 //String[] values=new String[4];
		
		// represnets the row/ record in the table
		 
		 System.out.println("Enter Yours  Name");
		  //values[0]=sc1.next();
		  u1.setName(sc1.next());   //u1.setName get the user name from keyboard
		
		  System.out.println("Enter your  Email");
		 
		 u1.setEmail(sc1.next());
		  
		 System.out.println("Enter your Password");
		  
		  u1.setPassword(sc1.next());
		  
		  System.out.println("Enter your Mobile Number");
		  
		  u1.setMob(sc1.next());
		
		  usDB.insert(u1);
		  
		  System.out.println("user Signup is Sucessfull");
		
		  

	}

	@Override
	public void updateProfile()
	{
		 
		System.out.println("please enter your  New email id");
		 u1.setNewemail(sc1.next());
		
		  System.out.println("please enter old email id ");
		 
		   u1.setEmail(sc1.next());
		   
		   usDB.update(u1);
		   
		   System.out.println("Email-ID sucessfully updated ");
		
	}

	@Override
	public void deleteProfile()
	{
		  System.out.println("please enter your email id");
			u1.setEmail(sc1.next());

            usDB.delete(u1);
            
            System.out.println("profile is sucessfully deleted");

	}

	@Override
	public void login() {
		// TODO Auto-generated method stub

	}

}
