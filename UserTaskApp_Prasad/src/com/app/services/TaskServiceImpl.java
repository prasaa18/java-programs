package com.app.services;

import java.util.Scanner;

import com.app.database.TaskDatabase;
import com.app.database.UserDatabase;
import com.app.entities.Task;
import com.app.entities.User;

public class TaskServiceImpl implements TaskService {


	  Scanner sc1=new Scanner(System.in);
	  TaskDatabase tdb=new TaskDatabase();
	  Task t1=new Task();
	@Override
	public void addTask() 
	{
		
		
		 //String[] values=new String[4];
		
		// represnets the row/ record in the table
		 
		 System.out.println("Enter Yours  task  Name");
		  //values[0]=sc1.next();
		  
		 t1.setTaskname(sc1.next());   //u1.setName get the user name from keyboard
		
		  System.out.println("Enter your Task discription ");
		 
		 t1.setDescription(sc1.next());
		  
		 System.out.println("Enter your Status ");
		  
		  t1.setStatus(sc1.next());
		  
		  System.out.println("Enter your start date ");
		  
		  t1.setStart_Date(sc1.next());
		 
		  
		  System.out.println("Enter your end date ");
		  
		  t1.setEnd_Date(sc1.next()); 
		  
        System.out.println("Enter your uId");
		  
		   t1.setUID(sc1.nextInt());
		  
		   tdb.insert(t1);
		  
		  System.out.println(" Task  is Sucessfull added");
		

	}

	@Override
	public void editTask() {
      System.out.println("User Task edit Started");
		
		
		

		System.out.println("Enter your New Start_date");
		t1.setNewStart_date(sc1.next()); 
		
		System.out.println("Enter your current Start_date");
		t1.setStart_Date(sc1.next());
		
		
		/*System.out.println("Enter your current End_date");
		t1.setEnd_date(scn.next());
		
		System.out.println("Enter your New End_date");
		t1.setNewEnd_date(scn.next());*/
		
		tdb.update(t1);
		System.out.println("Task edited Successfully");

	}

	@Override
	public void deleteTask() {
	
		 System.out.println("please enter your task name");
			t1.setTaskname(sc1.next());

         tdb.delete(t1);
         
         System.out.println("Task is sucessfully deleted");
	}

	@Override
	public void viewoneTask() {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewAllTask() {
		// TODO Auto-generated method stub

	}

}
