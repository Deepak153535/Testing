package Assignment;

public class Program33 {

	//33.WAP TO CALCULATE CUBE OF EVERY DIGIT IF DIGIT IS ODD IN A NUMBER.
	
	public static void main(String[] args) {
		
		int n=12335577;
		
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==1)
			{
				int b=3,cube=1;
				while(b>0)
				{
					cube=cube*rem;
					b--;
				}
				System.out.println(cube);
			}
			
			n=n/10;
		}
	}
}
