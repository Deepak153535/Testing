package March30;

public class Program57 {

	public static void main(String[] args) {
		int sum=0;
		int n=145;
		int temp=n;
		while(n>0)
		{
			int fact=1;
			int rem=n%10;
			while(rem>0)
			{
				fact=fact*rem;
				rem--;
			}
			n=n/10;
			sum=sum+fact;
			System.out.println("Factorial is : "+fact);
		}
		System.out.println("sum is : "+sum);
	
		if(temp==sum)
		{
			System.out.println("Strong number is : "+temp);
		}
		else
		{
			System.out.println("Not a Strong number is : "+temp);
		}
	}
}
