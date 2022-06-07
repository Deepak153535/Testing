package March30;

public class Program54 {

	public static int sum(int n)
	{
		
		int sum=0;
		while(n>=1)
		{
			int rem=n%10;
			
			if(rem%2==0)
			{
				sum=sum+rem;
				
			}
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		
		int r=sum(123456789);
		System.out.println("Sum of even Number is : "+r);
		int i=1;
		int sq=1;
		while(i<=2)
		{
			sq=sq*r;
			i++;
		}
		System.out.println(r+ " Square is : "+sq);
	}
}
