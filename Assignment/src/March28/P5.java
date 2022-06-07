package March28;

public class P5 {

	public static void main(String[] args) {
		
		foo(3729);
	}
	
	static void foo(int x)
	{
		if(x<10)
		{
			System.out.println(x);
		}
		else
		{
			int y=x%10;
			foo(x/10);
			System.out.println(y);
		}
	}
}

