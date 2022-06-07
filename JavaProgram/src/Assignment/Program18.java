package Assignment;

public class Program18 {

	//18.WAP TO PRINT EVEN DIGITS IN A NUMBER.
	
	public static void main(String[] args) {
		
		
		int n=987654321;
		
		while(n>0)
		{
			int rem=n%10;
			
			if(rem%2==0)
			{
				System.out.println(rem);
			}
			n=n/10;
		}
	}
}
