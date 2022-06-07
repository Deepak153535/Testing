package Assignment;

public class Program46 {

	//46.TRACING FOR FACTORIAL PROGRAM 4,6.
	
	public static void main(String[] args) {
		
		int n=46;
		
		while(n>0)
		{
			int rem=n%10;
			int fact=1;
			while(rem>0)
			{
				fact=fact*rem;
				rem--;
			}
			System.out.println(fact);
			
			n=n/10;
		}
	}
}
