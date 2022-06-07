package MultipleTry_Catch;

public class Program2 {

	public static void main(String[] args) {
		
		try
		{
			int[] a=new int[5];
			a[5]=30/0;
		}
		catch(Exception e)
		{
			System.out.println("Parent");
		}
		catch(ArithmeticException e)
		{
			System.out.println("jav");
		}
		
	}
}
