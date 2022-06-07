package Inheritance;

public class SingleDriver extends Single{

	public void run()
	{
		System.out.println(super.i);
	}
	
	public static void main(String[] args) {
		
		SingleDriver s=new SingleDriver();
		s.run();
		SingleDriver s1=new SingleDriver();
		
		System.out.println(s1.toString());
	}
}
