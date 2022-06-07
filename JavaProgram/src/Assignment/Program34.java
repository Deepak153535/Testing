package Assignment;

public class Program34 {

	//34.CALCULATE THE SUM OF SQUARE OF EACH DIGIT IF DIGIT IS EVEN IN A NUMBER.
	
	public static void main(String[] args) {
		
		int sum=0;
		int n=123456765;
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==0)
			{
			
				int b=2,sq=1;
				while(b>0)
				{
					sq=sq*rem;
					b--;
				}
				System.out.println(sq);
				sum=sum+sq;
			}
			n=n/10;
		}
		System.out.println("sum is : "+sum);
	}
}
