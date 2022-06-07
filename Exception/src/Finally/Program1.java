package Finally;

public class Program1 {

	//When an exception does not occur
	public static void main(String[] args) {
		
		try
		{
			int data=25/5;
			System.out.println(data);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally block");
		}
		System.out.println("rest the code...");
	}
	
}
