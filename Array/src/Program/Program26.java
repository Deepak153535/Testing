package Program;

public class Program26 {

	//26.WAP TO COUNT EVEN DIGITS IN A NUMBER.
	
	public static void main(String[] args) {
		
		int n=3282382;
		int count=0;
		while(n!=0)
		{
			int rem=n%10;
			if(rem%2==0)
			{
				count++;
			}
			n/=10;
		}
		System.out.println("Even number count is : "+count);
	}
}
