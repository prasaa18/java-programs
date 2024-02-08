package com.app.main;

import com.app.entities.Task;
import com.app.services.TaskServiceImpl;
import com.app.services.UserServiceImpl;

public class Mainclass {

	public static void main(String[] args) {
		
		// us1=new UserServiceImpl();
		//us1.signup();
		//us1.updateProfile();
		//us1.deleteProfile();
		
		TaskServiceImpl ts=new TaskServiceImpl();
		ts.addTask();
		ts.editTask();
		ts.deleteTask();
		
		
	}

}
