package Assignment;

public class Program15 {

	//15.WAP TO PRINT SUM OF EVEN NO B/W 20 TO 10.
	
	public static void main(String[] args) {
		
		int i=20;
		
		int sum=0;
		
		while(i>=10)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
			i--;
		}
		System.out.println("sum is : "+sum);
	}
}
