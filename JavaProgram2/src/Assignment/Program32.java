package Assignment;

public class Program32 {

	//32.WAP TO CALCULATE SQUARE OF THE DIGIT IN A NUMBER.IF THE DIGIT IS EVEN THEN ONLY FIND THE SQUARE.
	
	public static void main(String[] args) {
		
		int n=89241834;
		int pow=1;
		
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==0)
			{
				int b=1;
				pow=1;
				while(b<=2)
				{
					pow=pow*rem;
					b++;
				}
				System.out.println(pow); 	
			}
			n=n/10;
		}
	}
}
