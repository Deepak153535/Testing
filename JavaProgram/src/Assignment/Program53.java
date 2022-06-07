package Assignment;

public class Program53 {

	//53.DESIGN A METHOD TO CALCULATE ADDITION OF ALL DIGITS PRESENT IN A NUMBER AND RETURN THE SUM.
	
	public static void main(String[] args) {
		
		int a=sum(2513122);
		System.out.println(a);
	}
	public static int sum(int n)
	{
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		return sum;
	}
}
