package march23;

public class Program17 {

	public static void main(String[] args) {
		
		int n=234567;
		
		while(n>0)
		{
			int rem=n%10;
			
			System.out.println(rem);
			
			n=n/10;
		}
		
	}
}
