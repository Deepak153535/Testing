package March29;

public class Program51 {

	public static void main(String[] args) {
		int base=5;
		int power=2;
		System.out.println(base+" Square is : "+squre(base,power));
	}
	public static int squre(int a,int b)
	{
		int sq=1;
		int i=1;
		while(i<=b)
		{
			sq=sq*a;
			i++;
		}
		return sq;
	}
}
