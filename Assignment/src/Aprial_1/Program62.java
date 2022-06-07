package Aprial_1;

public class Program62 {

	public static void main(String[] args) {
		int n=5;
		int count=0;
		for(int i=1;i<=n;i++)
		{
			count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			
			
		}
		if(count==2)
		{
			System.out.println(n+" : is prime");
		}
		else
		{
			System.out.println(n+" : is not prime");
		}
	}
}
