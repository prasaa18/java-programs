package com.inner;

public class Demo 
{
	 private int id=11;
	 public class InnerClass
	 {
		 private int id=18;
		 public void data() 
		 {
		   System.out.println(id);
		   System.out.println(Demo.this.id);

		}
	
	 }

	public static void main(String[] args) {

    Demo d=new Demo();
     Demo.InnerClass in=d.new InnerClass();
     in.data();
	}

}
