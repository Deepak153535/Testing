package march23;

public class Program26 {

	public static void main(String[] args) {
		
		int n=123456;
		int count=0;
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==0)
			{
				System.out.println(rem);
				count++;
			
			}
			n=n/10;
		}
		System.out.println("Count even numer is : "+count);
	}
}
