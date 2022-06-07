package Practice;

public class Program85 {

	//85.DESIGN A METHOD TO CREATE AN INTEGER ARRAYAND TO READ INTEGER ELEMENTS.->IN CLASS
	
	public static void main(String[] args) {
		
		int[] a=test();
		
		for(int i:a)
		{
			System.out.println(i);
		}
		
	}
	public static int[] test()
	{
		
		int n[]= {2,4,5,7,8};
		
		return n;
	}
	
}
