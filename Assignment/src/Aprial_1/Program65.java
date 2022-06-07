package Aprial_1;

public class Program65 {

	public static void main(String[] args) {
		
		int sum=0;
		int n=153;
		int temp=n;
		int b=3;
		
		while(n>0)
		{
			int sq=1;
			int j=1;
			int rem=n%10;
			while(j<=b)
			{
				sq=sq*rem;
				j++;
			}
			//System.out.println(sq);
			sum=sum+sq;
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println(temp+" : No is armstrong");
		}
		else
		{
			System.out.println(temp+" : No is not armstrong");
		}
	}
}
