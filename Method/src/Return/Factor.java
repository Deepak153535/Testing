package Return;

public class Factor {

	public static void main(String[] args) {
		
		
		System.out.println(fact());
	}
	public static int fact()
	{
		int num=5;
		int fact=1;
		int i=1;
		while(i<=num)
		{
			fact=fact*i;
			i++;
			
		}
		return fact;
	}
}
