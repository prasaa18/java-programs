package com.threads;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
public class FixedThreadPool {

	public static void main(String[] args) 
	{

		CallableTask task= new CallableTask("morning");
		ExecutorService  excutorService=Executors.newFixedThreadPool(4);
		Future<String> result=  (Future<String>) excutorService.submit(task);
		try
		{
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
