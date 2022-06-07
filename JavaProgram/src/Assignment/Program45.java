package Assignment;

public class Program45 {

	//45.WAP TO CALCULATE FACTORIAL IF THE DIGIT IS ODD IN A NUMBER.
	
	public static void main(String[] args) {
		
		int n=1226543423;
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==1)
			{
				int fact=1;
				while(rem>0)
				{
					fact=fact*rem;
					rem--;
				}
				System.out.println(fact);
			}
			n=n/10;
		}
		
	}
}
