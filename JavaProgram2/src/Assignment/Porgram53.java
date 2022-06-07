package Assignment;

public class Porgram53 {

	//53.DESIGN A METHOD TO CALCULATE ADDITION OF ALL DIGITS PRESENT IN A NUMBER AND RETURN THE SUM.
	
	public static void main(String[] args) {
		
	
		
		int sum=add(43732463);
		
		System.out.println(" Sum of all digit is : "+sum);
	}
	public static int add(int n)
	{
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		return sum;
	}
}
