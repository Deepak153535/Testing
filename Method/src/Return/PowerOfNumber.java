package Return;

public class PowerOfNumber {

	public static void main(String[] args) {
		
		System.out.println(pow());
	}
	public static int pow()
	{
		int a=5;
		int b=3;
		int i=1;
		int fact=1;
		while(i<=b)
		{
			fact=fact*a;
			i++;
		}
		return fact;
	}
}
