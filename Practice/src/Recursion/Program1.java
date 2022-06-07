package Recursion;

public class Program1 {

	static int i=1;
	public static void main(String[] args) {
		
		System.out.println("This is main method");
		test();
		System.out.println("main method end");
	}
	public static void test()
	{
		i++;
		while(i<10)
		{
			System.out.println("this is test method");
			test();
		}
		
	}
}
