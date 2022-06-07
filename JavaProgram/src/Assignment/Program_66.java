package Assignment;



public class Program_66 {

	//-WAP TO PRINT ARMSTRONG NO IN 1 TO 1000.

	public static void main(String[] args) {
		
		int i=1;
		while(i<=1000)
		{
			int sum=0;
			int n=i;
			int temp=n;
			
			while(n>0)
			{
				int rem=n%10;
				int b=1;
				int s=1;
				while(b<=3)
				{
					s=s*rem;
					b++;
				}
				sum=sum+s;
				n=n/10;
			}
			if(temp==sum)
			{
				System.out.println(temp+" armstrong number");
			}
			else
			{
				System.out.println(temp+" not armstrong number");
			}
			i++;
		}
	}
}
