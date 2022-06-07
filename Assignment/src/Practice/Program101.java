package Practice;

public class Program101 {

//101.DESIGN A METHOD TO ACCEPT ARRAY AND INDEX VALUE.
	
	public static void main(String[] args) {
		
		int[]a= {1,3,5,7,8,9,5,3};
		
		test(a,a.length);
		
	}
	public static void test(int []a,int b)
	{
		
		for(int i=0;i<b;i++)
		{
			System.out.println(i+" "+a[i]);
		}
	}
}
