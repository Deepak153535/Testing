package Assignment;

public class Program19 {

	//19.WAP TO PRINT ODD DIGITS IN A NUMBER.
	
	public static void main(String[] args) {
		
		int number=1484392891;
		
		while(number>0)
		{
			int rem=number%10;
			if(rem%2==1)
			{
				System.out.println(rem);
			}
			number=number/10;
		}
	}
}
