package Assignment;

public class Program19 {

	//19.WAP TO PRINT ODD DIGITS IN A NUMBER.
	
	public static void main(String[] args) {
		
		int n=987654321;
		
		while(n>0)
		{
			int rem=n%10;
			
			if(rem%2==1)
			{
				System.out.println(rem);
			}
			n=n/10;
		}
	}
}
