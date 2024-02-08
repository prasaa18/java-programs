package com.jspiders.jdbc.verison2;
import java.util.Scanner;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

class Database
{
	 String dbUrl="jdbc:mysql://localhost:3306/usersdb";
	 String dbUsername="root";
	 String dbPassword="passw0rd";
	  
	 Connection con=null; 
	 
   public void connect()
   {
	     try 
	      {
		   
		   con=  DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
	       }
	      catch (SQLException e) 
	      {
	
		    e.printStackTrace();
	       }     
	    
	    System.out.println("Connected to Mysql database");
   }
   public void disConnect()
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
class UserService
{ 
	 Database db= new Database();
	  Scanner sc1=new Scanner(System.in);
	 public void signup()
	 {
		
		 
		 System.out.println("Enter Yours Name");
		 String name=sc1.next();
		 
		 System.out.println("Enter your Email");
		 String email=sc1.next();
		  
		 System.out.println("Enter your Password");
		  String password=sc1.next();
		  
		  System.out.println("Enter your Mobile Number");
		  String mob=sc1.next();
		  
		 
		  //connect to database
		   db.connect();
		  
          
		   
		   //save the data
		  
//String insertQuery="insert into usersdb.user values ("+0+","+"'"+name+"'"+","+"'"+email+"'"+","+"'"+password+"'"+","+"'"+mob+"'"+");";
		   String insertQuery="insert into usersdb.user values (0,?,?,?,?);";
	
        
        try
		{
	    	PreparedStatement pstmt;
			pstmt = db.con.prepareStatement(insertQuery);//Creates a Statement object for sending SQL statements to the database.
		    pstmt.setString(1,name);
		    pstmt.setString(2,email);
		    pstmt.setString(3,password);
		    pstmt.setString(4,mob);
			//System.out.println(insertQuery);
			pstmt.executeUpdate();//save the data
		    System.out.println("user sign up was sucessfully ");
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	   
		//close connection
	    db.disConnect();
	 }
	 public void updateProfile()
		{
			System.out.println("please enter your  email id");
			String oldEmail = sc1.next();
			
			System.out.println("please enter new email id ");
			String newEmail = sc1.next();
			
		   //connect to db
		   db.connect(); 	
		   String updateQuery ="update usersdb.user set email=? where email=?";
		    try
			{
		    	PreparedStatement pstmt;
				pstmt = db.con.prepareStatement(updateQuery);
				pstmt.setString(1,oldEmail);
				pstmt.setString(2, newEmail);
				//Creates a Statement object for sending SQL statements to the database.
			    pstmt.executeUpdate();//save the data
			    System.out.println("users email  updated sucessfully ");
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		   
		  //close connection
		  db.disConnect();
		}
         
	 public void deleteProfile()
		{
		 System.out.println("please enter your old email id");
			String Email=sc1.next();
		  //connect to db
		  db.connect(); 	
		  String deleteQuery = "delete from usersdb.user where email=?;";
		  try
			{
		    	PreparedStatement pstmt;
				pstmt = db.con.prepareStatement(deleteQuery);
				
				//Creates a Statement object for sending SQL statements to the database.
			    pstmt.setString(1, Email);
				pstmt.executeUpdate();
			    System.out.println("users email  updated sucessfully ");
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		   
		  
		  //close connection
		  db.disConnect();
		}
		
	//viewProfile
		public void viewProfile()
		{
		  System.out.println("please enter email id");
		  String emailID = sc1.next();
		  
		  //connect to db
		  db.connect(); 	
		 
		  String selectQuery = "select*from usersdb.user where email=?;";
		  try 
			{
		    	PreparedStatement stmt;
				
		    	stmt = db.con.prepareStatement(selectQuery);/*Creates a Statement object for 
		    	                                 sending SQL statements to the database.*/
			    stmt.setString(1, emailID);
				ResultSet rs=stmt.executeQuery();
				                             // which returns a single ResultSet object.*/
				
				
				rs.next();//move cursor to next row/record
				
			   //Assign to variables   get the data from ResultSet columns
				int    uid           = rs.getInt(1);
				String name          = rs.getString(2);
				String email         = rs.getString(3);
				String password      = rs.getString(4);
				String mob           = rs.getString(5);
				
				System.out.println("---user profile--");
				
				System.out.println("Uid      :"+uid);
				System.out.println("Nam   :"+name);
				System.out.println("Email   :"+email);
				System.out.println("password :"+password);
				System.out.println("mob    :"+mob);
				
				System.out.println("---user profile--");
				
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		    
	      //close connection
		  db.disConnect(); 
		}
		
		
		//login
		public void login()
		{
		  System.out.println("please enter email id");
		  String emailID = sc1.next();
		  
		  System.out.println("please enter password");
		  String password=sc1.next();
		  
		  //connect to db
		  db.connect(); 	
		 
		  String selectUserQuery = "select*from usersdb.user where email="+"'"+emailID+"'"+"AND password="+"'"+password+"';";
		  try 
			{
		    	Statement stmt;
				
		    	stmt = db.con.createStatement();/*Creates a Statement object for 
		    	                                 sending SQL statements to the database.*/
			    
				
		    	ResultSet res = stmt.executeQuery(selectUserQuery);/*Executes the given SQL statement, 
				                                which returns a single ResultSet object.*/	
				
				if(res.next()==true)//move cursor to next record
				{
					System.out.println("User login sucess");
				}
				else
				{
					System.out.println("Incorrect user name/password");
				}
				
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		    
	      //close connection
		  db.disConnect(); 
		}
	 
}
public class Mainclass {

	public static void main(String[] args)
	{
		UserService us1=new UserService();
   //us1.signup();
     us1.updateProfile();
     //us1.deleteProfile();
//  us1.viewProfile();
		//us1.login();
          
	}

}


