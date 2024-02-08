package com.io;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.BufferedOutputStream;
class Serializatin implements  Serializable
{
	int id;
	String name;
	public Serializatin(int id, String name)
	{
		this.id=id;
		this.name=name;
		
	}
}
public class serial {

	public static void main(String[] args) throws Exception
	{
		Serializatin s1=new Serializatin(211,"aa");
		
        FileOutputStream fout =new FileOutputStream("f1.txt");
        BufferedOutputStream b=new BufferedOutputStream(fout);
        ObjectOutputStream out=new ObjectOutputStream(fout);
        out.writeObject(s1);
        Serializatin o2=null;
        FileInputStream fis=new FileInputStream("f1.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
        ObjectInputStream ois=new ObjectInputStream(bis);
        o2=(Serializatin)ois.readObject();
        System.out.println("sucess "+o2.id+" "+o2.name);
        }

}
