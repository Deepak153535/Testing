package Assignment;

public class Program58 {

	//58.WAP TO PRINT THE STRONG NUMBER B/W 1 TO 1000.
	
	public static void main(String[] args) {
		
		int i=1;
		while(i<=1000)
		{
			int n=i;
			int sum=0;
			int temp=n;
			while(n>0)
			{
				int rem=n%10;
				int fact=1;
				while(rem>0)
				{
					fact=fact*rem;
					rem--;
				}
				sum=sum+fact;
				n=n/10;
			}
			if(temp==sum)
			{
				System.out.println(temp+" : Strong number");
			}
			else
				
			{
				System.out.println(temp+" : not strong number");
			}
			i++;
		}
	}
}
