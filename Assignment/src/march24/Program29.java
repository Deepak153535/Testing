package march24;

public class Program29 {

	public static void main(String[] args) {
		
		int n=211;
		int temp=n;
		int r=1,rem=0;
		while(0<n)
		{
			r=n%10;
			rem=rem*10+r;
			n=n/10;
		}
		if(temp==rem)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not Palindrome");
		}
	}
}
