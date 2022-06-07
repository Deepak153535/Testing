package March29;

public class Program48 {

	public static void main(String[] args) {
		
		int n=123456789;
		int sum=0;
		while(n>=1)
		{
			
			int rem=n%10;
			if(rem%2==0)
			{
				System.out.println(rem);
				int fact=1;
				
				while(rem>=2)
				{
					fact=fact*rem;
					rem--;
				}
				sum=sum+fact;
				System.out.println(fact);
			}
			
			n=n/10;
		}
		System.out.println("sum is  "+sum);
	}
}
