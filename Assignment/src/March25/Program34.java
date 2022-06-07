package March25;

public class Program34 {

	public static void main(String[] args) {
		
		int n=123456789;
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
		System.out.println("Sum of even number is : "+sum);
	}
}
