package com.assignments;

class demo1
{
	 private int id;
	private String name;
	 private String dep;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	@Override
	public String toString() {
		return "demo1 [id=" + id + ", name=" + name + ", dep=" + dep + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getDep()=" + getDep() + "]";
	}
	
	public  void display()
	{
		System.out.println("this is demo method");
	}
}
public class Inheritance  extends demo1
{
	@Override
	public  void display()
	{
		System.out.println(" this is overriden method");
		
	}

	public static void main(String[] args) 
	{
		
		Inheritance d1=new Inheritance();
		d1.setDep("java");
		d1.setId(101);
		d1.setName("pr");
		System.out.println(d1.getDep() +" "+d1.getId()+" " +d1.getName());
		d1.display();

	}

}
