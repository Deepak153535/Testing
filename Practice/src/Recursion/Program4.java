package Recursion;

public class Program4 {

	public static void main(String[] args) {
		
		int result=big(big(big(23,4),6),3);
		System.out.println("Biggest is : "+result);
	}
	public static int big(int a,int b)
	{
		int big=a>b?a:b;
		return big;
	}
}
