package BasicProgram;

public class FiboancciSeries_Recursion {

	static int n=0,n1=1,n2=0;
	public static void fibo(int i)
	{
		
		if(i>0)
		{
			n2=n+n1;
			n=n1;
			n1=n2;
			
			System.out.print(n2+" ");
			
			fibo(i-1);
		}
		
		
		
		
	}
	public static void main(String[] args) {
		
		int i=10;
		System.out.print(n+" "+n1);
		fibo(i-2);
		
	}
}
