package march24;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int n=121;
		int temp=n;
		
		int rev=0;
		while(n>0)
		{
			int r=n%10;
			rev=rev*10+r;
			
			n=n/10;
			
		}
		if(temp==rev)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("Not a Palindrome Number ");
		}
	}
}
