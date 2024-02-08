package youtube;

public interface User {
	
 void subscribe(Subscriber s);
 void  unSubscriber(Subscriber s);
 void notifySubscriber();
 
   void upload(String title);
}
