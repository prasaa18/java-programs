package com.streams;
import java.util.List;
import java.util.Arrays;
public class printlnMethodreference {

	public static void main(String[] args)
	{
		List<String> names= Arrays.asList("Iostream","zz","other");
		names.forEach(e->System.out.println(e));
		names.forEach(System.out::println);
		
	}

}
