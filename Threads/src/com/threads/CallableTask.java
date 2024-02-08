package com.threads;

import java.util.concurrent.Callable;




public class CallableTask implements Callable<String>
	{
		String msg;
		
		public CallableTask(String msg) {
			this.msg=msg;
			
		}
		@Override
		public String call() throws Exception
		{
			return "very  "+ msg +"!";
		}



	}


