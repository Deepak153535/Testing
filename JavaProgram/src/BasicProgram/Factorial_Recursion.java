package BasicProgram;

public class Factorial_Recursion {

	public static int fact(int n)
	{
		if(n<=1)
		{
			return 1;
		}
		else
		{
			return n*fact(n-1);
		}
	}
	public static void main(String[] args) {
		
		System.out.println("Factorial is : "+fact(5));
	}
}