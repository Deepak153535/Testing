package Recursion;

public class Factorial {

	
	public static void main(String[] args) {
		
		int fact=test(5);
		System.out.println("Factorial is : "+fact);
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
