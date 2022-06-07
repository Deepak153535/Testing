package Assignment;

public class Program48 {

	//48.WAP TO CALCULATE SUM OF FACTORIAL OF EVEN DIGITS IN A NUMBER.
	
	public static void main(String[] args) {
		
		int n=1532643;
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==0)
			{
				int fact=1;
				while(rem>0)
				{
					fact=fact*rem;
					rem--;
				}
				System.out.println(fact);
				sum=sum+fact;
			}
			n=n/10;
		}
		System.out.println("sum is : "+sum);
	}
}
