package Finally;

public class Program2 {

	// When an exception occurr but not handled by the catch block
	
	public static void main(String[] args) {
		
		try
		{
			System.out.println("inside the try");
			int data=25/0;
			System.out.println(data);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally");
		}
		System.out.println("hello");
	}
}
