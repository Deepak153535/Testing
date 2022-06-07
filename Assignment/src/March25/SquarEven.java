package March25;

public class SquarEven {

	public static void main(String[] args) {
		
		int n=1234;
		
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			if(r%2==0)
			{
				sum=sum+(r*r);
			}
			n=n/10;
		}
		System.out.println(sum);
	}
}
