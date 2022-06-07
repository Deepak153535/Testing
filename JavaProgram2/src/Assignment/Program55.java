package Assignment;

public class Program55 {

	//55.DESIGN A METHOD TO RETURN FACTORIAL OF EACH DIGIT IN A NUMBER.->IN CLASS
	
	public static void main(String[] args) {
		
		int fact=fact(53);
		
		System.out.println("factorial of each digit is :  "+fact);
	}
	public static int fact(int n)
	{
		int fact=1;
		while(n>0)
		{
			int rem=n%10;
			int b=1;
			fact=1;
			n=n/10;
			while(b<=rem)
			{
				fact=fact*b;
				b++;
			}
			System.out.println(fact);
			if(fact>=0)
			{
					
			}
		
		}
		return fact;
		
		
	}
	
}
