package com.threads;
import java.util.concurrent.*;
public class Task implements Runnable
{
	String msg;
	
	public Task(String msg) {
		this.msg=msg;
		
	}
	@Override
	public void run()
	{
		System.out.println(msg+"good");
	}



}
