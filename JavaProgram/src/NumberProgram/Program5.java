package NumberProgram;

public class Program5 {

	//peterson number
	
	
	public static void main(String[] args) {
		
		int n=145;
		int temp=n;
		int sum=0;
		while(n>0)
		{
			int fact=1;
			int rem=n%10;
			while(rem>0)
			{
				fact=fact*rem;
				rem--;
				
			}
		sum=sum+fact;
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("Peterson no is : "+sum);
		}
		else
		{
			System.out.println("not Peterson no is : "+sum);
		}
		
	}
}
