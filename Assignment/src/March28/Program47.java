package March28;

public class Program47 {

	public static void main(String[] args) {
		
		int n=123456789;
		int sum=0;
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
				sum=sum+fact;
				System.out.println("Odd Number Factorial is : "+fact);
				
			}
			n=n/10;
		
		}
		System.out.println(" Odd Number sum is "+sum);
			
	}
	
}
