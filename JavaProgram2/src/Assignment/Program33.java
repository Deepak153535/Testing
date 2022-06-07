package Assignment;

public class Program33 {

	//33.WAP TO CALCULATE CUBE OF EVERY DIGIT IF DIGIT IS ODD IN A NUMBER.
	
	public static void main(String[] args) {
		
		int n=236873292;

		
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==1)
			{
				int cube=1;
				int i=1;
				while(i<=3)
				{
					cube=cube*rem;
					i++;
				}
				System.out.println(cube);
			}
			n=n/10;
		}
		
	}
}
