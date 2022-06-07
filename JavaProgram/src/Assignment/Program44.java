package Assignment;

public class Program44 {

	//44.WAP TO EXTRACT THE DIGIT IN A NO IF THE DIGIT IS EVEN THEN FIND FACTORIAL.
	
	public static void main(String[] args) {
		
		int n=123474332;
		
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==0)
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
