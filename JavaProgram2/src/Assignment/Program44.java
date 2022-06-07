package Assignment;

public class Program44 {

	//44.WAP TO EXTRACT THE DIGIT IN A NO IF THE DIGIT IS EVEN THEN FIND FACTORIAL.
	
	public static void main(String[] args) {
		
		int n=532873248;
		int i=1;
		
		while(n>0)
		{
			int rem=n%10;
		
			if(rem%2==0)
			{
				int fact=1;
				int b=1;
				while(b<=rem)
				{
					fact=fact*b;
					b++;
				}
				System.out.println(fact);
			}
			n=n/10;
		}
	}
	
}
