package Program;

public class Program21 {

	//21.WAP TO CALCULATE SUM OF EVEN DIGITS IN A NUMBER
	
	public static void main(String[] args) {
		
		int n=23827;
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			if(rem%2==0)
			{
				sum+=rem;
			}
			n/=10;
		}
		System.out.println("Even number sum is : "+sum);
	}
}
