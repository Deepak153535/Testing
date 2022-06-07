package Assignment;

public class Program26 {

	//26.WAP TO COUNT EVEN DIGITS IN A NUMBER
	
	public static void main(String[] args) {
		
		int n=123456789;
		
		int count=0;
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==0)
			{
				System.out.println(rem);
				count++;
			}
			n=n/10;
		}
		System.out.println("count even : "+count);
	}
}
