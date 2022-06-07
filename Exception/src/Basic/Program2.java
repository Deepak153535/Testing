package Basic;

public class Program2 {

	public static void main(String[] args) {
		
		try
		{
		int a=10;
		int b=0;
		
		int c=a/b;
		
		System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			//e.printStackTrace();  //E,D,S
			//System.out.println(e);
			//System.out.println(e.toString());//E,D
			
			System.out.println(e.getMessage());//D
		}
	}
}
