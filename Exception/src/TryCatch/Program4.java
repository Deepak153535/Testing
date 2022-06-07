package TryCatch;

public class Program4 {

	public static void main(String[] args) {
		
		try
		{
			int d1=50/0;
		}
		catch(Exception e)
		{
			int d2=100/0;
		}
		System.out.println("ok");
	}
}
