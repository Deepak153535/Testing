package Assignment;

public class Program86 {

	//86.DESIGN A METHOD TO CREATE AN ARRAY AND READ ARRAYELEMENTS FROM THE USER AND RETURN IT.->IN CLASS
	
	public static void main(String[] args) {
		
		int a[]= {1,2,4,5,6};
		int[] c=test(a);
		for(int i:c)
		{
			System.out.println(i);
		}
	}
	public static int[] test(int[] a)
	{
		return a;
	}
}
