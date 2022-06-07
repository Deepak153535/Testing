package March31;

public class Program59 {

	public static void main(String[] args) {
			
			int j=1;
			int n=6;
			int temp=n;
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
			if(temp==sum)
			{
				System.out.println("This is spaicel No : "+sum);
			}
			else
			{
				System.out.println("This is not spacial No : "+sum);
			}
		
			
	}
}
