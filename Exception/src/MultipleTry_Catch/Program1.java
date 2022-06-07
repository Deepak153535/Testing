package MultipleTry_Catch;

public class Program1 {

	public static void main(String[] args) {
		
		try
		{
			int[] a=new int[5];
			a[5]=10/0;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic");
		}
		catch(ArrayIndexOutOfBoundsException w)
		{
			System.out.println("ArrayIndexOutOfBounds");
		}
		catch(Exception e)
		{
			System.out.println("Parent");
		}
		System.out.println("ok");
	}
}
