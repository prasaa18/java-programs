package com.threads;
import java.util.concurrent.*;
public class SingleThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Task task= new Task("morning");
		ExecutorService  excu=Executors.newSingleThreadExecutor();
		
			for(int i=0; i<5; i++)
			{
				Task task= new Task("morning");
				excu.execute(task);
			}
		
	}

}
