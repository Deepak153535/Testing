package March29;

public class Program50 {

	public static void main(String[] args) {
		int n=5;
		System.out.println(n+" Factorial is : "+fact(n));
	}
	public static int fact(int n)
	{
		int fact=1;
		while(n>=1)
		{
			fact=fact*n;
			n--;
		}
		return fact;
	}
}
