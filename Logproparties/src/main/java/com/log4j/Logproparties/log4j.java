package com.log4j.Logproparties;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class log4j{

	static Logger logg=Logger.getLogger(log4j.class);
	public static void main(String[] args)
	{
		
	   PropertyConfigurator.configure("log4j.properties");
	   logg.debug("log4j appender sucessful");
      logg.info("this is infoi");
      logg.error("this iserror ");
      Demo d=new Demo();
		d.data();
      
	}

}
