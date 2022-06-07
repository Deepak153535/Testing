package March28;

public class Program45 {

	public static void main(String[] args) {
		
		int n=123456789;
		
		while(n>=1)
		{
			int rem=n%10;
			if(rem%2==1)
			{
				System.out.println(rem);
				int fact=1;
				while(rem>=1)
				{
					fact=fact*rem;
					rem--;
				}
				System.out.println("Odd Number Factorial is : "+fact);
			}
			n=n/10;
		}
	}
}
