package Assignment;

public class Program20 {

	//20.WAP TO CALCULATE SUM OF ALL DIGITS IN A NUMBER
	
	public static void main(String[] args) {
		
		int n=987654321;
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			
			sum=sum+rem;
			n=n/10;
			
		}
		System.out.println("sum is : "+sum);
	}
}
