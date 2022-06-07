package March25;

public class Program41 {

	public static void main(String[] args) {
		
		int n=6;
		int r=n;
		int i=1;
		int sum=0;
		while(n>i)
		{
		
			if(n%i==0)
			{
				System.out.println(i);
				sum=sum+i;
			}
			i++;
		}
		if(sum==r)
		{
			System.out.println("Perfact Number : "+sum);
		}
		else
		{
			System.out.println("Not perfact : "+sum);
		}
	}
}
