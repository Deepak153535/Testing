package Assignment;

public class Program16 {

	//16.WAP TO PRINT SUM OF ODD NO B/W 35 TO 11.
	
	public static void main(String[] args) {
		
		int i=35;
		int sum=0;
		while(i>=11)
		{
			if(i%2==1)
			{
				sum=sum+i;
				
			}
			i--;
		}
		System.out.println("sum is : "+sum);
	}
}
