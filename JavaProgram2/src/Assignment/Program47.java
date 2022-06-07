package Assignment;

public class Program47 {

	//47.WAP TO CALCULATE SUM OF FACTORIAL OF ODD DIGIT IN A NUMBER.
	
	public static void main(String[] args) {
		
		int n=871272375;
		int sum=1;
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==1)
			{
				int b=1;
				int fact=1;
				while(b<=rem)
				{
					fact=fact*b;
					b++;
				}
				sum=sum+fact;
				System.out.println(fact);
			}
			n=n/10;
		}
			System.out.println("Sum of odd Factorial is : "+sum);
	}
}
