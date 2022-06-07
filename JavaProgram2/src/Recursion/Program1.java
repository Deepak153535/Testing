package Recursion;

public class Program1 {

	public static void main(String[] args) {
		
		String b=test(10);
		
		System.out.println(b);
	}
	public static String test(int n)
	{
		if(n<=0)
		{
			return 0+" ";
		}
		else
		{
			return n+" "+test(n-1);
		}
	}
}
