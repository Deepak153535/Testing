package March25;

public class PerfactNumber {

	public static void main(String[] args) {
		
		int i=1;
		int n=6;
		int sum=0;
		while(i<n)
		{
			if(n%i==0)
			{
				System.out.println(i);
				sum=sum+i;
			}
			i++;
		}
		if(sum==n)
		{
			System.out.println("perfact number");
		}
		else
		{
			System.out.println("not perfact number");
		}
	} 
	
}
