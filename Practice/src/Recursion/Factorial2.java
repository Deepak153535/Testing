package Recursion;

public class Factorial2 {

	public static void main(String[] args) {
		
		System.out.println(" Factorial is : "+test(5));
	}
	public static int test(int n)
	{
		
		if(n<=1)
		{
			return 1;
		}
		else
		{
			return n*test(n-1);
		}
	}
}
