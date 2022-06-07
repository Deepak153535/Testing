package March28;

public class Factorial {

	public static void main(String[] args) {
	
		int n=12345678;
		
		
		int i=1;
		while(i<=n)
		{
			int rem=n%10;
			if(rem%2==0)
			{
				int fact=1;
				System.out.println(rem);
				fact =fact*rem;
			}
						n=n/10;
		}
		
		
	}
	
}
