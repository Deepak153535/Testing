package BasicProgram;

public class PrimeNumber {

	//2,3,5,7,11,13....
	
	public static void main(String[] args) {
		
		int count;
		for(int i=1;i<=100;i++)
		{
			count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
		
			if(count==2)
			{
				System.out.println(i+" : Prime number ");
			}
			else
			{
				System.out.println(i+" : not prime number ");
			}
		}
	}
}
