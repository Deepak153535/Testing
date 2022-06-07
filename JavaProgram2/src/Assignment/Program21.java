package Assignment;

public class Program21 {

	//21.WAP TO CALCULATE SUM OF EVEN DIGITS IN A NUMBER.
	
	public static void main(String[] args) {
		
		int n=41121213;
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
		System.out.println("sum is "+sum);
		
	}
}
