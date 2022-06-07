package march24;

public class Program32 {

	public static void main(String[] args) {
		
		int n=12345678;
		int i=1;
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==0)
			{
				System.out.println(rem*rem);
			}
			n=n/10;
		}
		
	}
}
