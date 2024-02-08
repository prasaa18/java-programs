package com.streams;
import java.util.*;
class Data 
{
	int id;
	String name;
	float price;
	public Data(int id,String name, float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		
	}
}
public class StreamProductExmple 
{

	public static void main(String[] args)
	{
		List<Data> li=new ArrayList<>();
		li.add(new Data(1,"iphone",45000f));
		li.add(new Data(2,"vivo",5000f));
		li.add(new Data(1,"nokia",6900f));
		
		li.stream().filter(p->p.price>30000f).map(n->n.price).forEach(System.out::println);
	}

}
