package march23;

public class Program22 {

	public static void main(String[] args) {
		
		int n=12345678;
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			if(n%2==1)
			{
				System.out.println(rem);
				sum=sum+rem;
			}
			n=n/10;
		}
		
		System.out.println("Odd number sum is : "+sum);
	}
}
