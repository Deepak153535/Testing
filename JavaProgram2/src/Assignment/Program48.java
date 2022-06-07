package Assignment;

public class Program48 {

	//48.WAP TO CALCULATE SUM OF FACTORIAL OF EVEN DIGITS IN A NUMBER.
	
	public static void main(String[] args) {
		
		int n=487322384;
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==0)
			{
				int b=1;
				int fact=1;
				while(b<=rem)
				{
					fact=fact*b;
					b++;
				}
				System.out.println(fact);
				sum=sum+fact;
			}
			n=n/10;
		}
		System.out.println("Factorial of sum even is : "+sum);
	}
}
