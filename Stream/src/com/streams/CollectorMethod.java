package com.streams;
import java.util.List;
import java.util.Arrays;

import java.util.stream.Collectors;
public class CollectorMethod {

	public static void main(String[] args) {

       List<Integer> n=Arrays.asList(5,6,7,8,10);
       List<Integer> even=n.stream().filter(x->x%2==0).map(i->i*2).collect(Collectors.toList());
       System.out.println(even);
       System.out.println(n);
	}

}
