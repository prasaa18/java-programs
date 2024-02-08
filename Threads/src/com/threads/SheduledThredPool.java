package com.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public class SheduledThredPool {

	//private static ExecutorService executors;

	public static void main(String[] args) 
	{

		
		ScheduledExecutorService excutorService=Executors.newScheduledThreadPool(0);
		
		
		ArrayList<ScheduledFuture<String>> results= new ArrayList<ScheduledFuture<String>>();
		for(int i=1;i<5;i++) 
		{
			TaskDemo task= new  TaskDemo("this is task " +i);
			ScheduledFuture<String> result= excutorService.schedule(task, i*2, TimeUnit.SECONDS);
			results.add(result);
		}
		try
		{
			//executors.awaitTermination(1,TimeUnit.SECONDS);
			for(ScheduledFuture<String> result:results)
			System.out.println(result.get());
		}
		catch(Exception e)
		{
			System.out.println("error occcured");
			e.printStackTrace();
		}
		excutorService.shutdown();
	}

}
