package march24;

public class Program30 {

	public static void main(String[] args) {
		
		int i=10;
		while(i<=200)
		{
			int n=i;
			int temp=n;
			int rem=0;
			while(n>0)
			{
				int r=n%10;
				rem=rem*10+r;
				n=n/10;
			}
			if(rem==temp)
			{
				System.out.println("palindrome numner  "+rem);
			}
			i++;
		}
	}
}
