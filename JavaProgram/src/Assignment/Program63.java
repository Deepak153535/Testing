package Assignment;

public class Program63 {

	//63.WAP TO PRINT PRIME NUMBER B/W 1 TO 50.
	
	public static void main(String[] args) {
		
		int count;
		for(int i=1;i<=50;i++)
		{
			count=0;
			for(int j=1;j<=50;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i+" Prime");
			}
			else
			{
				System.out.println(i+" Not prime");
			}
		}
	}
	
}
