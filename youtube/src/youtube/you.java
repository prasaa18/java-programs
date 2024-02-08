package youtube;


import java.util.Scanner;

public class you {

	public static void main(String[] args) {

		Channel subs=new Channel();
	    Scanner sc =new Scanner(System.in);
		Subscriber s1=new Subscriber(sc.next());
		Subscriber s2=new Subscriber(sc.next());
		subs.subscribe(s1);
		subs.subscribe(s2);
		subs.upload("core java");
		
	
		

	}

}
