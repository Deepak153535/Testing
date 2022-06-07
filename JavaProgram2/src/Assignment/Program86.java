package Assignment;

public class Program86 {

	//86.DESIGN A METHOD TO CREATE AN ARRAY AND READ ARRAYELEMENTS FROM THE USER AND RETURN IT.->IN CLASS
	
	public static void main(String[] args) {
		
		int[] i=test();
		
		for(int b:i)
		{
			System.out.println(b);
		}
	}
	public static int[] test()
	{
		int []a= {1,2,3,4,5,6,7};
		return a;
	}
}
