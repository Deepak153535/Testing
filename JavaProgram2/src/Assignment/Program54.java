package Assignment;

public class Program54 {

	//54.DESIGN A METHOD TO CALCULATE SUM OF EVEN DIGITS AND RETURN, INSIDE MAIN METHOD CALCULATE SQUARE OF RETURNING RESULT.
	
	public static void main(String[] args) {
		
		int sum=sum(478782183);
		System.out.println("Sum is even digit is : "+sum);
	}
	public static int sum(int n)
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
