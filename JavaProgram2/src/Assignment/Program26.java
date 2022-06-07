package Assignment;

public class Program26 {

	//26.WAP TO COUNT EVEN DIGITS IN A NUMBER.
	
	public static void main(String[] args) {
		
		int n=821348991;
		int count=0;
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==0)
			{
				count++;
				System.out.println(rem);
			}
			n=n/10;
		}
		System.out.println("Even count is : "+count);
	}
}
