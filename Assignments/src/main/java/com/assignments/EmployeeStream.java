package com.assignments;

import java.util.*;  
class Book {  
int id;  
String name,location;
public Book(int id, String name, String locatin) {  
    this.id = id;  
    this.name = name;  
    this.location=location;
}  
}  
public class EmployeeStream {  
public static void main(String[] args) {  
    //Creating list of Books  
    List<Book> list=new LinkedList<Book>();  
    //Creating Books  
    Book b1=new Book(101,"ra", "che");  
    Book b2=new Book(102,"Da","blr");  
    Book b3=new Book(103,"Oo","hyb");  
     
    list.add(b1);  
    list.add(b2);  
    list.add(b3);  
    
    list.stream().filter(b->b.id>=102).map(b->b.id).forEach(System.out::println);
}
}