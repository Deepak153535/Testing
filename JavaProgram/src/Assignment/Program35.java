package Assignment;

public class Program35 {

	//35.CALCULATE SUM OF CUBE OF EACH DIGIT IF DIGIT IS ODD.
	
	public static void main(String[] args) {
		
		int n=437821523;
		int sum=0;
		
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==1)
			{
				int cube=1,b=3;
				while(b>0)
				{
					cube=cube*rem;
					b--;
				}
				System.out.println(cube);
				sum=sum+cube;
			}
			n=n/10;
		}
		System.out.println("sum is : "+sum);
	}
}
