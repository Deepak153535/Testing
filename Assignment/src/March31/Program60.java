package March31;

public class Program60 {

	public static void main(String[] args) {
		
		int i=6;
		while(i<=28)
		{
			
			int j=1;
			int n=i;
			int sum=0;
			while(n>j)
			{
				
				if(n%j==0)
				{
					//System.out.println(j);
					sum=sum+j;
				}
				
				j++;
			
			
			}
				if(n==sum)
				{
					System.out.println("This is spaicel No : "+i);
				}
				else
				{
					System.out.println("This is not spacial No : "+i);
				}
				i++;
			}
	}
}
