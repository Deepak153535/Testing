package Assignment;

public class Program36 {

	//36.WAP TO PRINT DIVISORS OF 10.->IN CLASS
	
	public static void main(String[] args) {
		
		int n=10;
		
		int i=1;
		
		while(i<=n/2)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}
