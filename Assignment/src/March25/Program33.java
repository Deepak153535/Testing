package March25;

public class Program33 {

	public static void main(String[] args) {
		
		int n=123456789;
		
		System.out.println("Every Odd number \n cube is : ");
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==1)
			{
				System.out.println(rem*rem*rem);
			}
			n=n/10;
		}
	}
}
