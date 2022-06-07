package March29;

public class Program53 {

	public static void main(String[] args) {
		
		System.out.println(sum(1234));
	}
	public static int sum(int a)
	{
		int sum=0;
		while(a>=1)
		{
			int rem=a%10;
			
				sum=sum+rem;
			
			a=a/10;
		}
		return sum;
		
	}
}
