package NumberProgram;

public class Program4 {
//76=5776
	
	public static void main(String[] args) {
		
		
		int n=76;
		int b=2;
		int i=1;
		int sq=1;
		while(i<=b)
		{
			sq=sq*n;
			i++;
			System.out.println(sq);
			
			
		}
		while(sq>0)
		{
			int rem=sq%10;
			System.out.println(sq);
			sq=sq/10;
			
		}
	
	}
}
