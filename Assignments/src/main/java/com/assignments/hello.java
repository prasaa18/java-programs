package com.assignments;



import java.util.*;
class Employee extends Object
{
    int id;
    String name;
    long mobno;
    public Employee(int id,String name,long mobno)
    {
        this.id = id;
        this.name = name;
        this.mobno= mobno;
    }
    @Override
    public int hashCode()
    {
        return id;
    }
    @Override
    public String toString()
    {
        return name + " " + mobno + " " + id;
    }
    public boolean equals(Object obj)
    {
        return this.toString() == obj.toString();
    }
}
public class hello{
    public static void main(String[] args) {
      //  Object obj = new Object();
        Employee e1 = new Employee(10,"abc",1234567896);
        Employee e2 = new Employee(20,"abc",675465476);
        System.out.println(e1.hashCode());
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        
        System.out.println(e1.equals(e2));
    }
}
