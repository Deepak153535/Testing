package Assignment;

public class Program58 {

	//58.WAP TO PRINT THE STRONG NUMBER B/W 1 TO 1000.
	
	public static void main(String[] args) {
		
		int i=1;
		
		while(i<1000)
		{
			int n=i;
			int temp=n;
			int sum=0;
			while(n>0)
			{
				int rem=n%10;
				int b=1;
				int fact=1;
				while(b<=rem)
				{
					fact=fact*b;
					b++;
				}
				sum=sum+fact;
				n/=10;
			}
			if(temp==sum)
			{
				System.out.println(temp+" Strong Number");
			}
			else
			{
				//System.out.println(temp+" Not Strong Number");
			}
			i++;
		}
		
	}
}
