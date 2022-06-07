package Recursion;

public class Biggest {

	public static void main(String[] args) {
		
		int n=big(big(4,7),5);
		System.out.println("Biggest is : "+n);
	}
	public static int big(int a,int b)
	{
		int big=a>b?a:b;
		return big;
	}
}
