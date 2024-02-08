package com.app.database;

import java.sql.SQLException;

import com.app.entities.User;

public class UserDatabase extends DatabaseUtils implements Database {
   private String insertQuery= "insert into usersdb.user values (0,?,?,?,?);";
    private  String updateQuery ="update usersdb.user set email=? where email=?";
	private  String deleteQuery = "delete from usersdb.user where email=?;";
    
    @Override
	public void insert(Object obj) 
	{
	 connect();
	 try
	 {
	       pstmt=con.prepareStatement(insertQuery);
	       
	       User u1= (User)obj;// by using upcasted refernce we can only acess super cls 
	       pstmt.setString(1,u1.getName());
		    pstmt.setString(2,u1.getEmail());
		    pstmt.setString(3,u1.getPassword());
		    pstmt.setString(4,u1.getMob());
		    
	      
		    pstmt.execute();
      }
	 catch(SQLException e)
	 {
		 e.printStackTrace();
	 }
      disConnect();


	}

	@Override
	public void update(Object obj)
	{

		 connect();
		 try
		 {
		       pstmt=con.prepareStatement(updateQuery);
		       
		       User u1= (User)obj;// by using upcasted refernce we can only acess super cls 
		       pstmt.setString(1,u1.getNewemail());
			    pstmt.setString(2,u1.getEmail());
			    
			    pstmt.execute();
	      }
		 catch(SQLException e)
		 {
			 e.printStackTrace();
		 }
	      disConnect();


	}


	

	@Override
	public void delete(Object obj) 
	{
		 connect();
		 try
		 {
		       pstmt=con.prepareStatement(deleteQuery);
		       
		       User u1= (User)obj;// by using upcasted refernce we can only acess super cls 
		       pstmt.setString(1,u1.getEmail());
			   
			    
			    pstmt.execute();
	      }
		 catch(SQLException e)
		 {
			 e.printStackTrace();
		 }
	      disConnect();


	}

	@Override
	public void selectOne()
	{


	}

	@Override
	public void selectMany()
	{
		
	}

	@Override
	public void selectAll() 
	{
		

	}

}
