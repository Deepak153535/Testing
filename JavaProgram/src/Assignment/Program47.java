package Assignment;

public class Program47 {

	//47.WAP TO CALCULATE SUM OF FACTORIAL OF ODD DIGIT IN A NUMBER.
	
	public static void main(String[] args) {
		int sum=0;
		int n=12414543;
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==1)
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
		System.out.println("sum is "+sum);
	}
}
