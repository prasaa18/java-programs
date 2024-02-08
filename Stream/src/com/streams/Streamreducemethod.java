package com.streams;
import java.util.List;
import java.util.Arrays;
import java.util.Optional;
public class Streamreducemethod {

	public static void main(String[] args) {

       List<Integer> n=Arrays.asList(5,6,7,8,10);
       Optional<Integer> even=n.stream().filter(x->x*2>=15).reduce((ans1,ans2)->ans1+ans2);
       System.out.println(even);
       System.out.println(n);
	}

}
