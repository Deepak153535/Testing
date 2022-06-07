package Aprial_1;

public class Program61 {

	public static void main(String[] args) {
		
		int n=1234560;
		int count=0;
		while(n>0)
		{
			
			int rem=n%10;
			if(rem>=0)
			{
				count++;
			}
			n=n/10;
		}
		System.out.println(count);
	}
}
