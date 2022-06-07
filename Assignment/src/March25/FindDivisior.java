package March25;

public class FindDivisior {

	public static void main(String[] args) {
		
		int i=1;
		int n=6;
		
		while(n>i)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}
