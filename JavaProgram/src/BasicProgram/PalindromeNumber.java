package BasicProgram;

public class PalindromeNumber {
	//121,232...

	public static void main(String[] args) {
		
		int rem=0;
		int n=121;
		int temp=n;
		int sum=0;
		while(n>0)
		{
			rem=n%10;
			
			sum=sum*10+rem;
			n=n/10;
		
		}
	
		if(sum==temp)
		{
			System.out.println(sum+" : Is palindrome number");
		}
		else
		{
			System.out.println(sum+" : Is not palindrome number");
		}
	}
}
