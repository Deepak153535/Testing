package March29;

public class Program52 {

	public static void main(String[] args) {
		
		int a=5;
		int b=3;
		System.out.println(a+" of "+b+" Power is : "+power(a,b));
	}
	public static int power(int a,int b)
	{
		int pow=1;
		int i=1;
		while(i<=b)
		{
			pow=pow*a;
			i++;
		}
		return pow;
	}
}
