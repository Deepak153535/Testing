package Finally;

public class Program3 {

	//When an exception occurs and is handled by the catch block
	
	public static void main(String[] args) {
		
		try {
			
			System.out.println("inside try block");
			int data=25/0;
			System.out.println(data);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exceptionhandle");
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally block");
		}
		System.out.println("hello");
		
	}
}
