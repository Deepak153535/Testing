package TryCatch;

public class Program5 {

	public static void main(String[] args) {
		
		try
		{
			int i=50/0;
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
}
