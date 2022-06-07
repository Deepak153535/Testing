package Assignment;

public class Program22 {

	//22.WAP TO CALCULATE SUM OF ODD DIGITS IN A NUMBER
	
	public static void main(String[] args) {
		
		int n=123456789;
		
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==1)
			{
				System.out.println(rem);
				sum=sum+rem;
			}
			n=n/10;
		}
		System.out.println("sum is : "+sum);
	}
}
