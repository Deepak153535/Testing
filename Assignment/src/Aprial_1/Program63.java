package Aprial_1;

public class Program63 {

	public static void main(String[] args) {
		int n=50;
		int count=0;
		for(int i=1;i<=n;i++)
		{
			count=0;
			for(int j=1;j<=n;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i+ " : is prime");
			}
			else
			{
				System.out.println(i+" : is not prime"+i);
			}
		}
	}
}
