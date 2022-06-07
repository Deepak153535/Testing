package Assignment;

public class Program54 {

	//54.DESIGN A METHOD TO CALCULATE SUM OF EVEN DIGITS AND RETURN, INSIDE MAIN METHOD CALCULATE SQUARE OF RETURNING RESULT.
	
	public static void main(String[] args) {
		
		int a=sq(1413122);
		int i=1;
		int b=2,sq=1;
		while(b>=i)
		{
			sq=sq*a;
			i++;
		}
		System.out.println(sq);
	}
	public static int sq(int n)
	{
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==0)
			{
				sum=sum+rem;
			}
			n=n/10;
		}
			return sum;
	}
}
