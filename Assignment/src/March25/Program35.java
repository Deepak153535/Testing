package March25;

public class Program35 {

	public static void main(String[] args) {
		
		int n=123456789;
		
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==1)
			{
				//System.out.println(rem);
				System.out.print(rem*rem*rem+" ");
			}
			n=n/10;
			
		}
	}
}
