package youtube;

public class Subscriber {
	Channel ch=new Channel();
	private String name;
	public Subscriber(String name)
	{
		
		this.name=name;
	}
    
	public void update() {
		
		System.out.println("hi "+ name +" !  "+ ch.title +" vedio uploaded please watch " );
	}
}
