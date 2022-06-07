package Assignment;

public class Program13 {

	//13.WAP TO CALCULATE SUM OF EVEN NO B/W 1 TO 10 WITH TRACING.
	
	public static void main(String[] args) {
		
		int i=1;
		int sum=0;
		
		while(i<=10)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
			i++;
		}
		System.out.println("Sum of even is "+sum);
	}
}
