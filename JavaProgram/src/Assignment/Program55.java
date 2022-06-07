package Assignment;

public class Program55 {

	//55.DESIGN A METHOD TO RETURN FACTORIAL OF EACH DIGIT IN A NUMBER.->IN CLASS
	
	public static void main(String[] args) {
		
		int a=fact(524);
		System.out.println(a);
		//System.out.println(sum());
		
	}
	public static int fact(int n)
	{
		int a=1;
		int rem=1;
		while(n>0)
		{
			rem=n%10;
			
			n=n/10;
		}
		System.out.println(rem);
		return a;
	}
	public static int sum(int rem)
	{
		int fact=1;
		while(rem>0)
		{
			fact=fact*rem;
			rem--;
		}
		return fact;
	}
}
