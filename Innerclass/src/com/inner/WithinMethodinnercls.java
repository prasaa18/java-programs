package com.inner;

public class WithinMethodinnercls 
    {
         private int id=11;
		 public void m()
	   {
		 class InnerClass                     /// dont metion acess specifier
		 {
			 private int id=18;
			 public void data() 
			 {
			   System.out.println(id);
			   System.out.println(WithinMethodinnercls.this.id);

			}
		   }
			 InnerClass b=new InnerClass();
					 b.data();
		 
		 }

		public static void main(String[] args) {

			WithinMethodinnercls d=new WithinMethodinnercls();
	     //Demo.InnerClass in=d.new InnerClass();
	        d.m();
		}

	}
