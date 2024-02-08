package com.jspiders.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Mainclass {

	public static void main(String[] args)
	{
	 System.out.println("programs starts ...");
	  
	 String dbUrl="jdbc:mysql://localhost:3306/usersdb";
	 String dbUsername="root";
	 String dbPassword="passw0rd";
	 
	 Connection con=null;
	 try 
	 {
	    con=  DriverManager.getConnection(dbUrl,dbUsername,dbPassword);//open the connection	     
	    
	    System.out.println("Connected to Mysql database");
	    // int a=10/0;
	    
	 }
	 catch(SQLException ex)
	 {
		ex.printStackTrace(); 
	 }
	 
	 
	finally
	    {
			 try
			 {
			  con.close();//close the connection on the databse 
			    
			 System.out.println("Connection closed ");
			 }
			 catch(SQLException ex)
			 {
				ex.printStackTrace(); 
			 }
	     }
			 
	      System.out.println("programs ends  ...");
			 
	 
		
}
	

}
