package Assignment;

public class Program61 {

	//61.DESIGN A METHOD TO COUNT NO OF DIGITS IN A NUMBER.
	
	public static void main(String[] args) {
		
	int a=count(335432);
	System.out.println(a);
		
	}
	public static int count(int n)
	{
		int count=0;
		while(n>0)
		{
			int rem=n%10;
			count++;
			n=n/10;
		}
		return count;
	}
}
