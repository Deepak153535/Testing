package Recursion;

public class Factorial1 {

	static int fact=1;
	public static void main(String[] args) {
		
		int n=5;
		
		Factorial1 f=new Factorial1();
		f.facto(n);
		System.out.println(fact);
	}
	void facto(int b)
	{
		if(b>=1)
		{
		fact=fact*b;
		facto(b-1);
		}
		
	}
}
