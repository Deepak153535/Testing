package March25;

public class Program36 {

	public static void main(String[] args) {
		
		int n=12456789;
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==1)
			{
				System.out.println(rem+" ");
				int r=rem*rem*rem;
				sum=sum+r;
				
				
			}
			n=n/10;
		}
		System.out.println("Odd Number of cube sum is : "+sum);
	}
}
