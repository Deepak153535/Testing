package march23;

public class Program21 {

	public static void main(String[] args) {
		
		int n=12345678;
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			
			if(rem%2==0)
			{
				System.out.println(rem);
				sum=sum+rem;
			}
			n=n/10;
		}
		System.out.println("Even number sum is : "+sum);
	}
}
