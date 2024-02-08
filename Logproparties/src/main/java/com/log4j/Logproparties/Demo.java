package com.log4j.Logproparties;

import org.apache.log4j.Logger;

public class Demo 
{
	static Logger lo=Logger.getLogger(Demo.class);
	
	public void data() {
		
		lo.debug("in dsata");
	    lo.info("in demo");
	    lo.error("error in demo cls ");
	    lo.warn("in data method");
	}

	
}
