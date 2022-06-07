package Assignment;

public class Program14 {

	//14.WAPT PRINT SUM OF ODD NO B/W 1 TO 10 WITH TRACING.
	
	public static void main(String[] args) {
		
		int i=1;
		int sum=0;
		
		while(i<=10)
		{
			if(i%2==1)
			{
				sum=sum+i;
			}
			i++;
		}
		System.out.println("sum is : "+sum);
	}
}
