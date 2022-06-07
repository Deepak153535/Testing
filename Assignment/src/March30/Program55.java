
package March30;


public class Program55 {

	public static int fact(int n)
	{
	
		while(n>=1)
		{
			int rem=n%10;
			int r=rem;
			int fact=1;
			while(rem>=1)
			{
				fact=fact*rem;
				rem--;
			}
			System.out.println(r+" factorial of each digit in a number : "+fact);
			n=n/10;
			
		}
		return 0;
	}
	public static void main(String[] args) {
		
		System.out.println(fact(1234));
		
	}
}
