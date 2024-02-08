package com.app.entities;

public class User 
{
  private   int UID;
  private String name;
  private  String email;
  private  String newemail;
  private  String password;
  private String mob;
  
  
  
public String getNewemail() {
	return newemail;
}
public void setNewemail(String newemail) {
	this.newemail = newemail;
}
public int getUID() {
	return UID;
}
public void setUID(int uID) {
	UID = uID;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getMob() {
	return mob;
}
public void setMob(String mob) {
	this.mob = mob;
}
  
}
