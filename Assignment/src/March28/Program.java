package March28;

public class Program {

	public static void main(String[] args) {
		
		int n=1234;
		
		while(n>=1)
		{
			int rem=n%10;
			if(rem%2==0)
			{
				System.out.println(rem);
				int fact=1;
				
				while(rem>=1)
				{
					fact=fact*rem;
					rem--;
				}
				System.out.println("Factorial is "+fact);
			}
			
			n=n/10;
		}
	}
}
