package BasicProgram;

public class ArmstrongNumber {

	//23=4+9===> 13  is not armstrong number
	
	public static void main(String[] args) {
		int sum=0;
		int n=153;
		int temp=n;
		int b=3;
		while(n>0)
		{
			
			int sq=1;
			int rem=n%10;
			int i=1;
			while(i<=b)
			{
				sq=sq*rem;
				i++;
					
				
			}
			
			sum=sum+sq;
			n=n/10;
			
		}
		if(temp==sum)
		{
			System.out.println(temp+" : Number is armstrong ");
		}
		else
		{
			System.out.println(temp+" : Number is not armstrong");
		}
	}
	
}
