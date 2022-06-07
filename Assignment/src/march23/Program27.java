package march23;

public class Program27 {

	public static void main(String[] args) {
		
		int n=123456789;
		int count=0;
		while(n>0)
		{
			int rem=n%10;
			
			if(rem%2==1)
			{
				System.out.println(rem);
				count++;
			}
			n=n/10;
		}
		System.out.println("Count odd number is : "+count);
		
	}
}
