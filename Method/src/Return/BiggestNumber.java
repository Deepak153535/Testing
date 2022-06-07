package Return;

public class BiggestNumber {

	public static void main(String[] args) {
		
		System.out.println(big());
	}
	public static int big()
	{
		int a=20;
		int b=40;
		
		int big=a>b?a:b;
		return big;
	}
}
