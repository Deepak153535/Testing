package Assignment;

public class Program32 {

	//32.WAP TO CALCULATE SQUARE OF THE DIGIT IN A NUMBER.IF THE DIGIT IS EVEN THEN ONLY FIND THE SQUARE.
	
	public static void main(String[] args) {
		
		int n=123456789;
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==0)
			{
				int b=2,sq=1;
				while(b>0)
				{
					sq=sq*rem;
					b--;
				}
				System.out.println(sq);
			}
			n=n/10;
		}
	}
}
