package March29;

public class Program49 {

	public static void main(String[] args) {
		
		int r=test(2,4);
		if(r%2==0)
		{
			System.out.println("Number is even");
		}
		
		System.out.println(r);
	}
	public static int test(int a,int b)
	{
		return a+b;
	}
}
