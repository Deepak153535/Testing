package Assignment;

public class Program50 {

	//50.DESIGN A METHOD TO CALCULATE FACTORIAL OF A NUMBER AND RETURN FACTORIAL.->IN CLASS
	
	public static void main(String[] args) {
		
		int a=fact(5);
		System.out.println(a);
	}
	public static int fact(int n)
	{
		int i=1;
		int fact=1;
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
		return fact;
	}
}
