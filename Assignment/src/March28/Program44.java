package March28;

public class Program44 {

	public static void main(String[] args) {
		
		int n=123456789;
		
		while(n>=1)
		{
			int rem=n%10;
			
			if(rem%2==0)
			{
				System.out.println(rem);
				int fact=1;
				while(rem>=2)
				{
					
					fact=fact*rem;
					rem--;
				}
				System.out.println("Fcatorial is : "+fact);
				
			}
			n=n/10;
			
		}
		
	}
}
