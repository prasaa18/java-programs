package com.app.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DatabaseUtils
{
	private final String dbUrl="jdbc:mysql://localhost:3306/usersdb";
	private  final String dbUsername="root";
	private final String dbPassword="passw0rd";
	  
	 Connection con=null; 
	 PreparedStatement pstmt=null;
	 Statement statement=null;
	 
   final public void connect()
   {
	     try 
	      {
		   
		   con=  DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
		   System.out.println("connected to MYSQLK DB");
	       }
	      catch (SQLException e) 
	      {
	       
		    e.printStackTrace();
	       }     
	    
	   // System.out.println("Connected to Mysql database");
   }
   final public void disConnect()
   {

		 try
		 {
		  con.close();          //close the connection on the databse 
		    
		 System.out.println("Connection closed ");
		 }
		 catch(SQLException ex)
		 {
			ex.printStackTrace(); 
		 }
    }
}
