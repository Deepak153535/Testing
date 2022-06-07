package Assignment;

public class Program18 {

	//18.WAP TO PRINT EVEN DIGITS IN A NUMBER.
	
	public static void main(String[] args) {
		
		int number=319873298;
		
		while(number>0)
		{
			int rem=number%10;
			
			if(rem%2==0)
			{
				System.out.println(rem);
			}
			
			number=number/10;
		}
	}
	
	
}
