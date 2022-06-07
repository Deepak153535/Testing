package Assignment;

public class Program38 {

	//36.WAP TO PRINT DIVISORS OF 10.->IN CLASS
	
	public static void main(String[] args) {
		
		int i=1;
		int n=10;
		while(i<=n)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}
