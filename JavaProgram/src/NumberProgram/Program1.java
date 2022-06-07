package NumberProgram;

public class Program1 {

	//n=123456=654321
	
	public static void main(String[] args) {
		
		int n=123456;
		
		while(n>0)
		{
			int rem=n%10;
			System.out.println(rem);
			n=n/10;
		}
		
	}
}
