package march23;

public class Program {

	public static void main(String[] args) {
		
		int n=2345;
		while(n>0)
		{
			int rem=n%10;
			
			System.out.println(rem);
			n=n/10;
		}
	}
}
