package com.lambdaEx;
@FunctionalInterface
public interface Lambda
{
	public void demo();
	

	public static void main(String[] args)
	{
		Lambda l1=()->
		{
			System.out.println("hello");
		};
		l1.demo();
	}

	}


