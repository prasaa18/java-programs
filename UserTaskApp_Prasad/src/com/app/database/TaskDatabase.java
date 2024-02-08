package com.app.database;

import java.sql.SQLException;

import com.app.entities.Task;
import com.app.entities.User;


public class TaskDatabase extends DatabaseUtils implements Database {
   
	
	private String insertQuery= "insert into usersdb.task values (0,?,?,?,?,?,?);";
	
	private  String updateQuery ="update usersdb.task set Start_Date =? where Start_Date=?";
	private  String deleteQuery = "delete from usersdb.task where Taskname=?;";
	@Override
	public void insert(Object obj)
	{
          connect();
		
		try
		{
			pstmt = con.prepareStatement(insertQuery);
			Task t1= (Task) obj;			
			pstmt.setString(1, t1.getTaskname());
			pstmt.setString(2, t1.getDescription());
			pstmt.setString(3, t1.getStatus());
			pstmt.setString(4, t1.getStart_Date());
			pstmt.setString(5, t1.getEnd_Date());
			pstmt.setInt(6, t1.getUID());
			
			pstmt.executeUpdate();
		}
		catch (SQLException e)
		{
			
			e.printStackTrace();
		}
		
		disConnect();
		
		
	
		
	}

	@Override
	public void update(Object obj) {
		

		 connect();
		 try
		 {
		       pstmt=con.prepareStatement(updateQuery);
		       
    
		       
		        Task t1= (Task)obj;                            // by using upcasted refernce we can only acess super cls 
		         pstmt.setString(1,t1.getNewStart_date());
			    pstmt.setString(2,t1.getStart_Date());
			    
			    pstmt.execute();
	      }
			   
			    
			   
		 catch(SQLException e)
		 {
			 e.printStackTrace();
		 }
	      disConnect();

	}

	@Override
	public void delete(Object obj) {

		connect();
		 try
		 {
		       pstmt=con.prepareStatement(deleteQuery);
		       Task t1= (Task)obj;
		       
		       pstmt.setString(1,t1.getTaskname());
			   
			    
			    pstmt.execute();
	      }
		 catch(SQLException e)
		 {
			 e.printStackTrace();
		 }
	      disConnect();

	}

	@Override
	public void selectOne() {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectMany() {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectAll() {
		// TODO Auto-generated method stub

	}

}
