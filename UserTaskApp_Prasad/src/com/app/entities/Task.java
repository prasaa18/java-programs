package com.app.entities;

public class Task
{
  private int TID;
  private  String Taskname;
  private String Description;
  private String Status;
  private String Start_Date;
 private String End_Date;
 private int UID;
 private String NewStart_date;
 
 
public int getTID() {
	return TID;
}
public void setTID(int tID) {
	TID = tID;
}
public String getTaskname() {
	return Taskname;
}
public void setTaskname(String taskname) {
	Taskname = taskname;
}
public String getDescription() {
	return Description;
}
public void setDescription(String description) {
	Description = description;
}

public String getStatus() {
	return Status;
}
public void setStatus(String status) {
	this.Status = status;
}
public String getStart_Date() {
	return Start_Date;
}
public void setStart_Date(String start_Date) {
	Start_Date = start_Date;
}
public String getEnd_Date() {
	return End_Date;
}
public void setEnd_Date(String end_Date) {
	End_Date = end_Date;
}

public void setUID( int uid) 
{
	this.UID=uid;
}
	public int getUID() {

	return UID;
}
public void setNewStart_date( String new_start_Date){
	  
	this.NewStart_date =new_start_Date;
}
public String  getNewStart_date() {

return NewStart_date;
  
}
}
