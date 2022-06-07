package Assignment;

public class Program30 {

	//30.WAP TO PRINT PALINDROME NUMBER B/W 10 TO 200.
	
	public static void main(String[] args) {
		
		int i=1;
		
		while(i<=200)
		{
			int n=i;
			int temp=n;
			int rem=0,sum=0;
			while(n>0)
			{
				rem=n%10;
				sum=sum*10+rem;
				n=n/10;
			}
			if(temp==sum)
			{
				System.out.println(temp+" : Palindrome number");
			}
			else
			{
				System.out.println(temp+" : Not palindrome number");
			}
			
			i++;
		}
		
	}
}
