package Assignment;

public class Program50 {

	//50.DESIGN A METHOD TO CALCULATE FACTORIAL OF A NUMBER AND RETURN FACTORIAL.->IN CLASS
	
	public static void main(String[] args) {
		
		int a=fact(6);
		System.out.println("Factorial is : "+a);
		
	}
	public static int fact(int n)
	{
		int fact=1;
		while(n>0)
		{
			fact=fact*n;
			n--;
		}
		return fact;
	}
}
