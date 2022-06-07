package TryCatch;

public class Program2 {

	public static void main(String[] args) {
		int i=50;
		int a=0;
		int c;
		try
		{
		
		c=i/a;
		}catch(Exception e)
		{
		System.out.println(i/(a+2));
		}
		System.out.println("done");
	}
}
