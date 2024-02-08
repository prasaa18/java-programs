package com.threads;


import java.time.LocalDateTime;
import java.util.concurrent.Callable;




public class TaskDemo implements Callable<String>
	{
		String msg;
		
		public TaskDemo(String msg) {
			this.msg=msg;
			
		}
		@Override
		public String call() throws Exception
		{
			return "Here is only Task "+msg +"executed on : "+LocalDateTime.now().toString();
		}



	}



