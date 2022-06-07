package Recursion;

public class Sum {

	public static void main(String[] args) {
		
		int n=sum(100);
		System.out.println("sum is "+n);
	}
	public static int sum(int n)
	{
		if(n<=0)
		{
			return 0;
		}
		else
		{
			return n+sum(n-1);
		}
	}
}
