package youtube;

import java.util.ArrayList;
import java.util.List;

public class Channel implements User {
  
	List<Subscriber> subs=new ArrayList<Subscriber>();
	 String title;
	@Override
	
	 public  void  unSubscriber(Subscriber s)
	 {
		 subs.remove(s);
	 }
	@Override
	public void subscribe(Subscriber s)
	{
		subs.add(s);
	}
	@Override
	public void notifySubscriber() {
	for(Subscriber s:subs)
	{
		s.update();
		System.out.println(title);
	}

	}
//	public void displayTitle() {
//		System.out.println(title);
//	}

	@Override
	public void upload(String title)
	{
		this.title=title;
		notifySubscriber();
	}
	
	

}
