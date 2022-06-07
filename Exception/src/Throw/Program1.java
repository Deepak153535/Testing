package Throw;

public class Program1 {

	// Throwing Unchecked Exception
	
	public static void main(String[] args) {
		test(13);
		System.out.println("rest of the code");
	}
	public static void test(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("eligible");
		}
		else
		{
			System.out.println("not eligible");
		}
	}
}
